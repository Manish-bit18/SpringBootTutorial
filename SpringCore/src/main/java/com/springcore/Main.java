package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //Rules are written in AppConfig
        OrderService  order = context.getBean(OrderService.class);
        order.placeOrder();

        //CartService cart = new CartService();
        CartService cart = context.getBean(CartService.class);
        cart.addTocart();

    }
}