package com.blog.service.impl;

import com.blog.entity.User;
import com.blog.mapping.UserMapper;
import com.blog.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Resource(name = "userMapper")
    private UserMapper userMapper;

    public User getById(String id){
        return userMapper.selectByPrimaryKey(id);
    }
    /**
     * 添加用户
     * @param user
     * @return 不返回
     * @throws Exception
     */
    public void add(User user){
        userMapper.insertSelective(user);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void delete(String id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void query(String id) {
        userMapper.selectByPrimaryKey(id);

    }

    @Override
    public User login(String user, String pas) {
        return userMapper.login(user,pas);
    }

    @Override
    public List<User> getUser() {

        return null;
    }

    @Test
    public void test(){
        User user = new User();
        user.setUserUuid("2");
        user.setPassword("2");
        user.setUseremail("22");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add(user);
    }
    @Test
        public void deletsTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.delete("1");
        }
}
