package com.example.security.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class UserDTO {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private String name;

    private Integer age;

    private String email;
}
