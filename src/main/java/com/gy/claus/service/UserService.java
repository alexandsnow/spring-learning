package com.gy.claus.service;

import com.gy.claus.Util.GyLogProcessor;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    GyLogProcessor gyLogProcessor;

    public void getUserInfo(){
        gyLogProcessor.info();
    }
}
