package com.blog.login.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages= {"com.blog.login.dao"})
@ComponentScan(basePackages={"com.blog.login"}) 
public class SpringMain {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringMain.class, args);
    }
}
