package com.clife.bigdate.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.clife.bigdata.common.model.User;
import com.clife.bigdata.common.service.UserService;

/**
 * Created by Jaycekon on 2017/9/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User saveUser(User user) {
        user.setId(1);
        System.out.println(user.toString());
        return user;
    }
}
