package com.stackroute.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.stackroute.controller"})
public class MyConfig {

    @Bean
    public InternalResourceViewResolver method() {
        InternalResourceViewResolver ir = new InternalResourceViewResolver();
        ir.setPrefix("/WEB-INF/views/");
        ir.setSuffix(".jsp");
        return ir;
    }
}

