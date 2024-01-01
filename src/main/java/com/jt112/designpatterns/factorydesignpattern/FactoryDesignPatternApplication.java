package com.jt112.designpatterns.factorydesignpattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class FactoryDesignPatternApplication implements CommandLineRunner {

	@Autowired
	private PaymentProviderFactory paymentProviderFactory;

	public static void main(String[] args) {
		SpringApplication.run(FactoryDesignPatternApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		log.info("Welcome to the 2024");

		paymentProviderFactory.getPaymentProvider(PayUPaymentProvider.BEAN_ID).acceptPayment();
		paymentProviderFactory.getPaymentProvider(PayPalPaymentProvider.BEAN_ID).acceptPayment();
		paymentProviderFactory.getPaymentProvider(StripePaymentProvider.BEAN_ID).acceptPayment();
	}
}
