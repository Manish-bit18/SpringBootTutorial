package com.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

     @Autowired
     private OrderService order;
//    PaymentService(OrderService order){
//            this.order = order;
//    }

    public void pay(){
        System.out.println("Payment Done");


        //Order Details is Not its reasponsibility
       // order.getOrderDetails();
    }
}
