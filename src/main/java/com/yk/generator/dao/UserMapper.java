package com.yk.generator.dao;

import com.yk.generator.entity.User;
import com.yk.generator.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    /**
     * @mbg.generated
     */
    long countByExample(UserExample example);

    /**
     * @mbg.generated
     */
    int deleteByExample(UserExample example);

    /**
     * @mbg.generated
     */
    @Delete({
        "delete from t_user",
        "where t_id = #{tId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer tId);

    /**
     * @mbg.generated
     */
    @Insert({
        "insert into t_user (t_id, t_name, ",
        "t_age, t_address)",
        "values (#{tId,jdbcType=INTEGER}, #{tName,jdbcType=VARCHAR}, ",
        "#{tAge,jdbcType=INTEGER}, #{tAddress,jdbcType=VARCHAR})"
    })
    int insert(User record);

    /**
     * @mbg.generated
     */
    int insertSelective(User record);

    /**
     * @mbg.generated
     */
    List<User> selectByExample(UserExample example);

    /**
     * @mbg.generated
     */
    @Select({
        "select",
        "t_id, t_name, t_age, t_address",
        "from t_user",
        "where t_id = #{tId,jdbcType=INTEGER}"
    })
    @ResultMap("com.yk.generator.dao.UserMapper.BaseResultMap")
    User selectByPrimaryKey(Integer tId);

    /**
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * @mbg.generated
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * @mbg.generated
     */
    @Update({
        "update t_user",
        "set t_name = #{tName,jdbcType=VARCHAR},",
          "t_age = #{tAge,jdbcType=INTEGER},",
          "t_address = #{tAddress,jdbcType=VARCHAR}",
        "where t_id = #{tId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}