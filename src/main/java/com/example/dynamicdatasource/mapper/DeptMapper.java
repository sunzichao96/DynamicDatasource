package com.example.dynamicdatasource.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dynamicdatasource.Po.Dept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptMapper extends BaseMapper<Dept> {
}
