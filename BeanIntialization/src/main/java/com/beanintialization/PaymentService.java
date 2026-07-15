package com.beanintialization;

import jdk.jfr.Label;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PaymentService {

    PaymentService(){
        System.out.println("Payment started");
    }
    public void pay(){
        System.out.println("Payment Done");
    }
}
