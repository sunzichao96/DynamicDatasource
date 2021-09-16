package com.example.dynamicdatasource.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.dynamicdatasource.Po.Dept;
import com.example.dynamicdatasource.Po.User;
import com.example.dynamicdatasource.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("user")
    public IPage<User> testUser(Integer currentPage, Integer pageSize) {
        return testService.userQuery(currentPage, pageSize);
    }

    @RequestMapping("dept")
    public IPage<Dept> testDept(Integer currentPage, Integer pageSize) {
        return testService.deptQuery(currentPage, pageSize);
    }


}
