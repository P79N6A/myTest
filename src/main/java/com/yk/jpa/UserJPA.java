package com.yk.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;



public interface UserJPA extends
        JpaRepository<UserEntity, Long>,
        JpaSpecificationExecutor,
        Serializable{

    List<UserEntity> queryByName(String name);

    @Query(value = "select * from t_user where t_id = :id",
            nativeQuery = true)
    List<UserEntity> queryById(@Param("id") String id);

    @Query(value = "select t_id from t_user where t_id = :id",
            nativeQuery = true)
    List<BigInteger> queryNameById(@Param("id") String id);

    @Query(value = "from UserEntity a where a.address = :address"
//            countQuery = "select count(*) from t_user where t_address = ?1",
//            nativeQuery = true
    )
    Page<UserEntity> queryByAddress(@Param("address")String address, Pageable pageable);

    @Modifying
    @Query(value = "update t_user a set a.t_name=:#{#userEntity.name} where a.t_id=:#{#userEntity.id}",nativeQuery = true)
    int updateNameById(@Param("userEntity")UserEntity userEntity);

    @Query(value = "select * from t_user where t_id = :#{#userEntity.id}",nativeQuery = true)
    List<UserEntity> queryById2(@Param("userEntity")UserEntity userEntity);

    void deleteById(Long id);
}
