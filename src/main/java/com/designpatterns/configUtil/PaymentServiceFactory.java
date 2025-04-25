package com.designpatterns.configUtil;

import com.designpatterns.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentServiceFactory {
    private final Map<String, PaymentService> paymentServiceMap;

    public PaymentServiceFactory(Map<String, PaymentService> paymentServiceMap) {
        this.paymentServiceMap = paymentServiceMap;
    }

    public PaymentService getPaymentService(String paymentMode) {
        return paymentServiceMap.get(paymentMode);
    }
}
