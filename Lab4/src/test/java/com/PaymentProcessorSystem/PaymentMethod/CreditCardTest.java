package com.PaymentProcessorSystem.PaymentMethod;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CreditCardTest {

    @Test
    void testInitialization() {
        Map<String, String> details = new HashMap<>();
        details.put("cardNumber", "4111111111111111");
        details.put("expirationDate", "12/25");
        details.put("cvv", "123");
        details.put("nameOnCard", "John Doe");

        CreditCard creditCard = new CreditCard(details);

        assertNotNull(creditCard, "CreditCard object should not be null");
    }

    @Test
    void testProcessPayment() {

        Map<String, String> details = new HashMap<>();
        details.put("cardNumber", "4111111111111111");
        details.put("expirationDate", "12/25");
        details.put("cvv", "123");
        details.put("nameOnCard", "John Doe");

        CreditCard creditCard = new CreditCard(details);
        double amount = 100.00;

        creditCard.processPayment(amount);
    }
}
