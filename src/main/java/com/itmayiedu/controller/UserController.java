package com.itmayiedu.controller;

import com.itmayiedu.test01.service.Test01UserService;
import com.itmayiedu.test02.service.Test02UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private Test01UserService test01UserService;

    @Autowired
    private Test02UserService test02UserService;

    @RequestMapping("/insertUser01")
    public String insertUser01(String name,Integer age){
        test01UserService.insertUser(name,age);
        return "insertUser01";
    }

    @RequestMapping("/insertUser02")
    public String insertUser02(String name,Integer age){
        test02UserService.insertUser(name,age);
        return "insertUser02";
    }

    @RequestMapping("/insertUser03")
    public String insertUser03(String name,Integer age){
        test02UserService.insertUser03(name,age);
        return "insertUser03";
    }
}
