package com.beanintialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
public class OrderService {

    private PaymentService payment;

    public OrderService(@Lazy PaymentService payment) {
       this.payment = payment;
    }

    public void placeOrder(){
        payment.pay();
        System.out.println("Order Placed");
    }

    public void orderDetails(){
        System.out.println("Order Details");
    }
}
