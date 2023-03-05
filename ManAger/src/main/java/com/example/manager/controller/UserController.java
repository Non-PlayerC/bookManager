package com.example.manager.controller;

import com.example.manager.common.Result;
import com.example.manager.controller.request.UserpageRequest;
import com.example.manager.entity.User;
import com.example.manager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;
    @GetMapping("/list")
    public Result list() {
        List<User> users = userService.list();
        return Result.success(users);
    }

    @GetMapping("/page")
    public Result page(UserpageRequest userpageRequest) {
        return Result.success(userService.page(userpageRequest));
    }
}
