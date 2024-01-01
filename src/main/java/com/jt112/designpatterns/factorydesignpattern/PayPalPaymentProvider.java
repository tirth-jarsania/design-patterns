package com.jt112.designpatterns.factorydesignpattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service(PayPalPaymentProvider.BEAN_ID)
@Slf4j
public class PayPalPaymentProvider implements PaymentProvider {
    public static final String BEAN_ID = "payPalPaymentProvider";

    @Override
    public void acceptPayment() {
        log.info("PayPal Payment is initialised now. Congrats!");
    }
}
