package com.example.manager.service.impl;

import com.example.manager.controller.request.UserpageRequest;
import com.example.manager.entity.User;
import com.example.manager.mapper.Usermapper;
import com.example.manager.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService{
    @Autowired
    Usermapper usermapper;

    //实现 IUserService 类
    @Override
    public List<User> list() {
        return usermapper.list();
    }

    @Override
    public List<User> page(UserpageRequest userpageRequest) {
        PageHelper.startPage(userpageRequest.getPageNum(),userpageRequest.getPageSize());
        List<User> users = usermapper.listByCondition(userpageRequest);
        return new PageInfo<>(users).getList();
    }
}
