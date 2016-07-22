package com.cn.user.daoMapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.cn.user.pojo.User;
/**
 * xml使用场景（3个）：

 * 1、条件不定的查询（eg.下边代码中的getAdminByConditions方法）
 * 2、增加对象返回自增主键（eg.下边代码的insertAdminWithBackId方法）
 * 3、在一个Mapper接口中，出现多个select查询（>=3个），且每个查询都需要写相同的返回@Results内容（这一部分内容通常很多），这样的话，为了使Mapper接口比较整洁，重复代码比较少，我们会将这些select方法的具体实现写在xml文件中，因为在xml文件的顶部我们就会配置与注解@Results异曲同工的东西。（当然，这一点如果嫌配置xml麻烦，这一点可忽略）
 * 注意：前两条是硬性的，是注解所解决不了的，而第三条只是建议。
 * 除了以上这三条之外，其他的都使用去注解就好。
 * @author moon
 *
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);
    
    @Insert("insert into user (id, user_name, password, age) values (#{id}, #{userName}, #{password}, #{age})")
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    /**
     * 获取User列表
     * @return
     */
    List<User> queryUsers();
    
    /**
     * 条件不定式查询
     * 我们这里使用@Param指定参数，这样的话，在UserMapper.xml中就不用再使用parameterType属性了；否则得写parameterType属性
     */
    public List<User> getUserByConditions(@Param("userName")String userName,
                                            @Param("password")String password, 
                                            @Param("start")int start, 
                                            @Param("limit")int limit);
    
    /**
     * 返回主键
     */
    public int insertUserWithBackId(User user);
}
    