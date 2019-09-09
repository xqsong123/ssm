package com.example.dao;

import com.example.entity.User;

public interface UserDao {
    User selectById(int id);
}
