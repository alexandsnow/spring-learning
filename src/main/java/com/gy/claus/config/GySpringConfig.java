package com.gy.claus.config;

import com.gy.claus.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(EnableGyLog.class)
public class GySpringConfig {

    @Bean
    public UserService userService(){
        return new UserService();
    }
}
