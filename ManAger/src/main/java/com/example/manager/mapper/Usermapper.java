package com.example.manager.mapper;

import com.example.manager.controller.request.UserpageRequest;
import com.example.manager.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Usermapper {
//    @Select("select * from user")
    List<User> list();
    List<User> listByCondition(UserpageRequest userpageRequestser);

}
