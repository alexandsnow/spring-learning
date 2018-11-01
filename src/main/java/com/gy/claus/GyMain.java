package com.gy.claus;

import com.gy.claus.config.GySpringConfig;
import com.gy.claus.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GyMain {
    public static void main(String[] args) {
        System.out.println("service start....");
        ApplicationContext content = new AnnotationConfigApplicationContext(GySpringConfig.class);
        UserService userService = content.getBean(UserService.class);
        userService.getUserInfo();


        System.out.println("service end....");
    }
}
