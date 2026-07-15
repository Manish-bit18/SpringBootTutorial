package com.springcore.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class UpiPayment implements PaymentService{
    public void payment(){
        System.out.println("Payment via Upi");
    }
}
