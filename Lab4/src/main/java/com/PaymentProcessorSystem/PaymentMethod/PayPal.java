package com.PaymentProcessorSystem.PaymentMethod;

import java.util.Map;

public class PayPal implements PaymentMethod {
    private String email;
    private String password;

    public PayPal(Map<String, String> details) {
        this.email = details.get("email");
        this.password = details.get("password");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("Email: " + email);
    }
}
