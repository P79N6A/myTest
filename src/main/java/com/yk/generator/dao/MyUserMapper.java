package com.yk.generator.dao;

import com.yk.generator.entity.User;
import com.yk.generator.entity.UserExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * .
 * <p/>
 *
 * @author yangk
 * @version 1.0.0
 * @since 2019-02-22
 *
 * 自定义的Mapper接口，自定义方法写在此处，同时需要修改自动生成的xml的namespace，
 * 思考是否有其他方式，可以不修改任何自动生成的文件，而达到和自定义方法共存。
 */

@Mapper
@Repository
public interface MyUserMapper extends UserMapper{

    User queryByIdMybatis2(int id);

    List<User> selectByExample2(UserExample example);
}
