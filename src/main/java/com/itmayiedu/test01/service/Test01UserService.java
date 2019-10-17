package com.itmayiedu.test01.service;

import com.itmayiedu.test01.mapper.Test01UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Test01UserService {

    @Autowired
    private Test01UserMapper userMapper;

    @Transactional
    public void insertUser(String name, Integer age) {
        userMapper.insert(name,age);
    }

}