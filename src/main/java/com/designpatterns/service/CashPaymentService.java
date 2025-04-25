package com.designpatterns.service;

import org.springframework.stereotype.Component;

@Component("CASH")
public class CashPaymentService implements PaymentService{
    @Override
    public void pay(double amount) {
        //return "Payment "+amount+" paid using Cash!!";
    }
}
