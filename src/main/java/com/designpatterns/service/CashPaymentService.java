package com.designpatterns.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("CASH")
@Lazy
public class CashPaymentService implements PaymentService{
    @Override
    public void pay(double amount) {
        //return "Payment "+amount+" paid using Cash!!";
    }
}
