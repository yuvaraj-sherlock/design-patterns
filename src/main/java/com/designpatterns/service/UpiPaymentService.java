package com.designpatterns.service;

import org.springframework.stereotype.Component;

@Component("UPI")
public class UpiPaymentService implements PaymentService{
    @Override
    public void pay(double amount) {
        //return "Payment "+amount+" paid using UPI!!";
    }
}
