package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.domain.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by littlebark on 2017/7/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes  = SpringBootStandardApplication.class)
public class MybatisTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    @Rollback
    public void findByName() throws Exception {
        userMapper.insert(1011,"bbb", 20);
        User u = userMapper.findByName("bbb");
        Assert.assertEquals(20, u.getAge().intValue());
    }
}
