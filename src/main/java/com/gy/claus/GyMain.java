package com.gy.claus;

import com.gy.claus.Util.GyLogTagUtil;
import com.gy.claus.config.GySpringConfig;
import com.gy.claus.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GyMain {
    public static GyLogTagUtil logUtil = new GyLogTagUtil(GyMain.class);


    public static void main(String[] args) {


        System.out.println("service start....");
        ApplicationContext content = new AnnotationConfigApplicationContext(GySpringConfig.class);
        content.getBean(UserService.class).getUserInfo("gaoyang");
        System.out.println("service end....");
    }
}
