package com.example.manager.controller.request;

import lombok.Data;

@Data
public class UserpageRequest extends BaseRequest{
    private String name;
    private String phone;
}
