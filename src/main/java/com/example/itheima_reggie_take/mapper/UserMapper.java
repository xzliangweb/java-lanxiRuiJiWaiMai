package com.example.itheima_reggie_take.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.itheima_reggie_take.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
