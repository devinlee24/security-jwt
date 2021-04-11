package com.example.security.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.security.dto.UserDTO;
import com.example.security.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
@DS("slave_1")
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDTO> {
}
