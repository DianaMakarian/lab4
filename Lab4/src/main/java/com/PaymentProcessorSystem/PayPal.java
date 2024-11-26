package com.PaymentProcessorSystem;

public class PayPal implements PaymentMethod {
    private String email;
    private String password;

    public PayPal() {}

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
