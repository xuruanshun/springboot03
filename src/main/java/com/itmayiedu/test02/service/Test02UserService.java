package com.itmayiedu.test02.service;

import com.itmayiedu.test01.mapper.Test01UserMapper;
import com.itmayiedu.test02.mapper.Test02UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Test02UserService {

    @Autowired
    private Test01UserMapper userMapper01;

    @Autowired
    private Test02UserMapper userMapper02;

    @Transactional
    public void insertUser(String name, Integer age) {
        userMapper02.insert(name,age);
    }

    @Transactional
    public void insertUser03(String name, Integer age) {
        //第一个数据源
        userMapper01.insert(name,age);
        //第二个数据源
        userMapper02.insert(name,age);
        int i = 1/0;
    }
}