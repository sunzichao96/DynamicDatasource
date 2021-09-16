package com.example.dynamicdatasource.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.dynamicdatasource.Po.Dept;
import com.example.dynamicdatasource.Po.User;


public interface TestService {

    IPage<User> userQuery(Integer currentPage, Integer pageSize);

    IPage<Dept> deptQuery(Integer currentPage, Integer pageSize);

}
