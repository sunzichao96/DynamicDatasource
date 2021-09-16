package com.example.dynamicdatasource.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dynamicdatasource.Po.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
