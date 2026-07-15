package com.circulardependency;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private PaymentService payment;

//    OrderService(PaymentService payment){
//        this.payment = payment;
//    }

    public void placeOrder(){
        payment.pay();

        getOrderDetails();
        System.out.println("Order Placed");
    }
    public void getOrderDetails(){
        System.out.println("Order Details");
    }

}
