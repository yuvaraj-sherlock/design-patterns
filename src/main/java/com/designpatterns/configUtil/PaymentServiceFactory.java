package com.designpatterns.configUtil;

import com.designpatterns.service.PaymentService;
import com.designpatterns.util.PaymentMode;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.Map;

@Service
public class PaymentServiceFactory {
   // private final Map<PaymentMode, PaymentService> paymentServiceMap = new EnumMap<>(PaymentMode.class);

    @Autowired
    private ApplicationContext applicationContext;

    /*@Autowired
    public PaymentServiceFactory(Map<String, PaymentService> beanMap) {
        // Map string keys to enum safely
        for (PaymentMode mode : PaymentMode.values()) {
            if (beanMap.containsKey(mode.name())) {
                paymentServiceMap.put(mode, beanMap.get(mode.name()));
            }
        }
    }*/

    public PaymentService getPaymentService(PaymentMode paymentMode) {
       // return paymentServiceMap.get(paymentMode);
        try {
            return applicationContext.getBean(paymentMode.name(), PaymentService.class);
        } catch (BeansException e) {
            return null; // Or throw custom exception for invalid payment mode
        }
    }
}
