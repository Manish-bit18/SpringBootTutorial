package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.springcore")
public class AppConfig {
    @Bean
    public User createUser(){
        return new User("Manish" ,18);
    }

    @Bean
    public CartService cartService(){
        return new CartService();
    }
}
