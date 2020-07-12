package com.offcn.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.offcn.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getName() {
        return "XXX";
    }
}
