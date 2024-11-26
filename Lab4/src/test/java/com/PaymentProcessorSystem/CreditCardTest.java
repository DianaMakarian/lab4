package com.PaymentProcessorSystem;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @org.junit.jupiter.api.Test
    void processPayment() {
        CreditCard creditCard = new CreditCard("1234-5678-9012-3456", "12/24", "123", "John Doe");
        creditCard.processPayment(100.0);

    }
}