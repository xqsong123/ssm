package com.example.dao;

import com.example.BaseTest;
import com.example.entity.User;
import com.example.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class UserDaoTest extends BaseTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void selectById(){
        User user = userDao.selectById(1);
        System.out.println();
        Assert.assertNotNull(user);
    }

}
