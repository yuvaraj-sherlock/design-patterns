package com.designpatterns.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("CreditCard")
@Primary
public class CredicardPaymentService implements PaymentService{
    @Override
    public String pay(double amount) {
        return "Payment "+amount+" paid using CreditCard!!";
    }
}
