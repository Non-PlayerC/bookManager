package com.example.manager.service;

import com.example.manager.controller.request.UserpageRequest;
import com.example.manager.entity.User;

import java.util.List;


public interface IUserService {
    List<User> list();

    Object page(UserpageRequest userpageRequest);
}
