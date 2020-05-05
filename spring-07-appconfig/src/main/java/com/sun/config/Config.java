package com.sun.config;

import com.sun.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sun")
public class Config {
    @Bean
    public User getUser(){
        return new User();
    }
}
