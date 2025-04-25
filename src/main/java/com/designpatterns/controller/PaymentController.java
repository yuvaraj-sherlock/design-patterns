package com.designpatterns.controller;

import com.designpatterns.configUtil.PaymentServiceFactory;
import com.designpatterns.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentServiceFactory paymentServiceFactory;

    public PaymentController(PaymentServiceFactory paymentServiceFactory) {
        this.paymentServiceFactory = paymentServiceFactory;
    }

    @GetMapping
    public String pay(@RequestParam double amount, @RequestParam String mode){
        PaymentService paymentService = paymentServiceFactory.getPaymentService(mode);
        if (paymentService == null) {
            return "Invalid payment mode!";
        }
        return paymentService.pay(amount);
    }
}
