package com.yk.controller;

import com.yk.generator.dao.MyUserMapper;
import com.yk.generator.entity.User;
import com.yk.generator.entity.UserExample;
import com.yk.jpa.UserEntity;
import com.yk.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * .
 * <p/>
 *
 * @author yangk
 * @version 1.0.0
 * @since 2019-02-22
 *
 * 此工程主要包含以下技术：
 * 1、使用JPA对数据库进行基本操作
 * 2、使用mybatie-genarator对数据库进行基本操作
 * 3、对genarator自动生成代码的功能进行扩展，并且不修改生成生成文件，以下为自我总结的最佳实践：
 *    1、自定义接口继承自动生成接口，并且添加@Mapper、@Repository注解，使用方法与原始mybatis相同
 *       ，生成接口不做任何改动
 *    2、自定义xml的namespace填自定义接口的路径，生成xml不做任何改动
 *    3、在自定义接口或xml中均可使用自动生成xml中的公共代码片段，如：resultMap、sql片段
 *    改进之处：
 *    1、自动生成代码生成位置改为target中，不需要做任何修改，也不允许修改
 *    2、将generator的生成代码方式改为插件方式，由于第一条的原因，所以一定会存在只有自定义代码而
 *       没有自动生成代码的时候，比如在一个人自动生成和提交，别人更新下来肯定是没有自动生成代码的，
 *       此时项目中会有编译错误，无法执行java代码方式的generator，所以推荐插件式。
 * 4、使用了java代码去配置spring的方式
 * 5、使用了springMVC的intercetor
 * 6、使用了spring的自定义监听
 *
 *
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    @Autowired
    private MyUserMapper userMapper;



    /**
     * 查询用户列表方法
     * @return
     */
    @PostMapping("/list")
    public List<UserEntity> list(){
        return userJPA.findAll();
    }

    @RequestMapping(value ="/listByName" )
    public List<UserEntity> listByName(String name){
        System.out.println(name);
        return userJPA.queryByName(name);
    }

    @RequestMapping(value ="/queryNameById" )
    public long queryNameById(String id){
        System.out.println(id);
        return userJPA.queryNameById(id).get(0).longValue();
    }

    @Transactional
    @RequestMapping(value ="/deleteById" )
    public String deleteById(Long id){
        System.out.println(id);
        userJPA.deleteById(id);
        return "s";
    }

    @RequestMapping(value ="/queryByAddress" )
    public Page<UserEntity> queryByAddress(String address, int size, int page){
        System.out.println(address);
        Sort.Order order = new Sort.Order("id");
        Sort sort = new Sort(order);
        Pageable pageable = new PageRequest(page,size,sort);
        return userJPA.queryByAddress(address,pageable);
    }

    @RequestMapping(value ="/queryById2" )
    public List<UserEntity> queryById2(UserEntity userEntity){
        System.out.println(userEntity.toString());
        return userJPA.queryById2(userEntity);
    }

    @Transactional
    @RequestMapping(value ="/updateNameById" )
    public int updateNameById(UserEntity userEntity){
        System.out.println(userEntity.toString());
        return userJPA.updateNameById(userEntity);
    }


    /**
     * 添加、更新用户方法
     * @param entity
     * @return
     */
    @RequestMapping(value = "/save")
    public UserEntity save(UserEntity entity)
    {
        return userJPA.save(entity);
    }

    /**
     * 删除用户方法
     * @param id 用户编号
     * @return
     */
    @RequestMapping(value = "/delete")
    public List<UserEntity> delete(Long id)
    {
        userJPA.delete(id);
        return userJPA.findAll();
    }

    //mybatis-----------------------------------------------------------------------

    /**
     * 测试mybatis注解方式查询
     * @param id
     * @return
     */
    @RequestMapping(value ="/queryByIdMybatis")
    public User queryByIdMybatis(int id){
        System.out.println(id);
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 测试generator自动生成的example查询的使用
     * @param name
     * @return
     */
    @RequestMapping(value ="/queryByNameMybatis")
    public List<User> queryByNameMybatis(String name){
        System.out.println(name);
        UserExample example = new UserExample();
        example.createCriteria().andTNameLike("%" + name + "%");
        return userMapper.selectByExample(example);
    }

    /**
     * 测试自定义映射接口和xml与generator生成的是否可以共存。
     * 成功
     * @param id
     * @return
     */
    @RequestMapping(value ="/queryByIdMybatis2" )
    public User queryByIdMybatis2(int id){
        System.out.println(id);
        return userMapper.queryByIdMybatis2(id);
    }

    /**
     * 测试自定义接口和xml是否可以使用自动生成出来的resultMap或sql片段。
     * 成功
     * @param name
     * @return
     */
    @RequestMapping(value ="/queryByNameMybatis2")
    public List<User> queryByNameMybatis2(String name){
        System.out.println(name);
        UserExample example = new UserExample();
        example.createCriteria().andTNameLike("%" + name + "%");
        return userMapper.selectByExample2(example);
    }

}
