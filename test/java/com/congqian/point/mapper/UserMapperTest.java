package com.congqian.point.mapper;

import com.congqian.point.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
public class UserMapperTest {
@Autowired
private UserMapper mapper;
    @Test
    public void insertUser() {
        User user=new User();
        user.setId("这个可");
        user.setName("qiancong");
        user.setDepartment("积分服务");
        user.setPassword("ok");
        user.setScore(100.2);
        mapper.insertUser(user);
    }
    @Test
    public void getUser(){
        List<User> list=mapper.getUser();
        User user1=list.get(1);
        log.info("第一个用户信息：{}",user1.getName());
        Assert.assertNotNull(user1);
    }

    @Test
    public void deleteUser(){
      mapper.deleteUser("22");
    }
    @Test
    public void updateUser(){
        User user=new User();
        user.setId("334");
        user.setName("qq");
        user.setScore(100.21);
        user.setDepartment("IP业务组");
        user.setPassword("1234");
    }

}