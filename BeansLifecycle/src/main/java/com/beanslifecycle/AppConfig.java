package com.beanslifecycle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    public void Demo(){
        System.out.println("AppConfig Demo");
    }
}
