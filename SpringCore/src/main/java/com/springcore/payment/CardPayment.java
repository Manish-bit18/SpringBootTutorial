package com.springcore.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier
public class CardPayment implements PaymentService{
    @Override
    public void payment(){
        System.out.println("Payment via Card");
    }

}
