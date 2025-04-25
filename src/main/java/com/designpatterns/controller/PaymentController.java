package com.designpatterns.controller;

import com.designpatterns.configUtil.PaymentServiceFactory;
import com.designpatterns.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentServiceFactory paymentServiceFactory;

    public PaymentController(PaymentServiceFactory paymentServiceFactory) {
        this.paymentServiceFactory = paymentServiceFactory;
    }

    @PostMapping
    public ResponseEntity<String> pay(@RequestParam double amount, @RequestParam String mode){
        PaymentService paymentService = paymentServiceFactory.getPaymentService(mode);
        if (paymentService == null) {
            return ResponseEntity.badRequest().body("Invalid payment mode!");
        }
        paymentService.pay(amount);
        return ResponseEntity.ok("Payment successful using " + mode);
    }
}
