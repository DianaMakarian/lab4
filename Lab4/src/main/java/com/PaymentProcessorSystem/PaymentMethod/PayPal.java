package com.PaymentProcessorSystem.PaymentMethod;

import java.util.HashMap;

public class PayPal implements PaymentMethod {
    private String email;
    private String password;

    public PayPal(double amount, HashMap<String, String> details) {
        this.email = details.get("email");
        this.password = details.get("password");
        processPayment(amount);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}
