package com.PaymentProcessorSystem.PaymentMethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;


class PayPalTest {

    @Test
    void testInitialization() {
        Map<String, String> details = new HashMap<>();
        details.put("email", "test@example.com");
        details.put("password", "securepassword");

        PayPal payPal = new PayPal(details);

        assertNotNull(payPal, "PayPal object should not be null");
    }

    @Test
    void testProcessPayment() {
        Map<String, String> details = new HashMap<>();
        details.put("email", "test@example.com");
        details.put("password", "securepassword");

        PayPal payPal = new PayPal(details);
        double amount = 50.75;

        payPal.processPayment(amount);
    }
}

