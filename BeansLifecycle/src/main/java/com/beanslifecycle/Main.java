package com.beanslifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService orderService = context.getBean(OrderService.class);
//        orderService.order();

        // The IOC also manages the AppConfig class.=

//        AppConfig app = context.getBean(AppConfig.class);
//        app.Demo();

        CartService cart = context.getBean(CartService.class);
        System.out.println(cart.getValue(1));

    }
}