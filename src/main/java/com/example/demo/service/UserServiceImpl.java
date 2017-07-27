package com.example.demo.service;

import com.example.demo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by littlebark on 2017/7/25.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void create(String name, Integer age) {
    }
    @Override
    public void deleteByName(String name) {
    }

    @Override
    public Integer getAllUsers() {
        return 1;
    }

    @Override
    public void deleteAllUsers() {
    }
}
