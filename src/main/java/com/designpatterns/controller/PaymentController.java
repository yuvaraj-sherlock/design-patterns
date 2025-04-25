package com.designpatterns.controller;

import com.designpatterns.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public String pay(@RequestParam double amount, @RequestParam String mode){
        return paymentService.pay(amount);
    }
}
