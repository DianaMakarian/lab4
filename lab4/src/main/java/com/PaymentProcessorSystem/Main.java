package com.PaymentProcessorSystem;

import com.PaymentProcessorSystem.PaymentFactory.PaymentSimpleFactory;
import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> creditCardDetails = new HashMap<>();
        creditCardDetails.put("cardNumber", "1234-5678-9012-3456");
        creditCardDetails.put("expirationDate", "12/24");
        creditCardDetails.put("cvv", "123");
        creditCardDetails.put("nameOnCard", "John Doe");

        HashMap<String, String> paypalDetails = new HashMap<>();
        paypalDetails.put("email", "john.doe@example.com");
        paypalDetails.put("password", "securepassword");

        HashMap<String, String> bankDetails = new HashMap<>();
        bankDetails.put("iban", "DE89370400440532013000");
        bankDetails.put("paymentPurpose", "Invoice Payment");

        PaymentMethod creditCardPayment = PaymentSimpleFactory.createPayment("CreditCard", creditCardDetails);
        creditCardPayment.processPayment(100.0);

        PaymentMethod paypalPayment = PaymentSimpleFactory.createPayment("PayPal", paypalDetails);
        paypalPayment.processPayment(50.0);

        PaymentMethod bankTransferPayment = PaymentSimpleFactory.createPayment("BankTransfer", bankDetails);
        bankTransferPayment.processPayment(200.0);
    }
}