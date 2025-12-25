package com.learning.SpringBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


    //1. field injection
    @Autowired
    private RazorpayPaymentService paymentService;

    // 2. constructor injection
//    public Application(RazorpayPaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    @Override
    public void run(String... args) {
        String payment = paymentService.pay();
        System.out.printf("Payment done: "+payment);
    }
}
