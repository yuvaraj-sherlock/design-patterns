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
    private final ApplicationContext applicationContext;

    @Autowired
    public PaymentServiceFactory(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public PaymentService getPaymentService(PaymentMode mode) {
        try {
            return applicationContext.getBean(mode.name(), PaymentService.class);
        } catch (BeansException ex) {
            throw new IllegalArgumentException("Invalid payment mode: " + mode);
        }
    }
}
