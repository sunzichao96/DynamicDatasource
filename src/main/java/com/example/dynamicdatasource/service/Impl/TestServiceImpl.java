package com.example.dynamicdatasource.service.Impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dynamicdatasource.Po.Dept;
import com.example.dynamicdatasource.Po.User;
import com.example.dynamicdatasource.mapper.DeptMapper;
import com.example.dynamicdatasource.mapper.UserMapper;
import com.example.dynamicdatasource.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public IPage<User> userQuery(Integer currentPage, Integer pageSize) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        IPage<User> page = new Page<>(currentPage, pageSize);
        userMapper.selectPage(page, wrapper);
        return page;
    }

    @Override
    @DS("slave_1")
    public IPage<Dept> deptQuery(Integer currentPage, Integer pageSize) {
        QueryWrapper<Dept> wrapper = new QueryWrapper<>();
        IPage<Dept> page = new Page<>(currentPage, pageSize);
        deptMapper.selectPage(page, wrapper);
        return page;
    }

}
