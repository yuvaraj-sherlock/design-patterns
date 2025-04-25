package com.designpatterns.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("CREDIT_CARD")
@Lazy
public class CredicardPaymentService implements PaymentService{
    @Override
    public void pay(double amount) {
       // return "Payment "+amount+" paid using CreditCard!!";
    }
}
