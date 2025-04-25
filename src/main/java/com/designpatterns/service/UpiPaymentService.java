package com.designpatterns.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("UPI")
@Lazy
public class UpiPaymentService implements PaymentService{
    @Override
    public void pay(double amount) {
        //return "Payment "+amount+" paid using UPI!!";
    }
}
