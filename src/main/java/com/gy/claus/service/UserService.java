package com.gy.claus.service;

import com.gy.claus.GyMain;
import com.gy.claus.Util.GyLog;
import com.gy.claus.Util.GyLogProcessor;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    GyLogProcessor gyLogProcessor;

    @GyLog
    public void getUserInfo(String world) {
        System.out.println("hello world" + world);
    }
}
