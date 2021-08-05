package com.atjh.demoafter.controller;

import com.atjh.demoafter.common.Result;
import com.atjh.demoafter.entity.User;
import com.atjh.demoafter.mapper.UserMapper;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserMapper userMapper;

    @PostMapping
    public Result<?> save(@RequestBody User user){
        userMapper.insert(user);
        return Result.success();
    }
}
