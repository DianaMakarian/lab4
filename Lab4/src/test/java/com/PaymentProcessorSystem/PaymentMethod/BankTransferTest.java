package com.PaymentProcessorSystem.PaymentMethod;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BankTransferTest {

    @Test
    void testInitialization() {
        Map<String, String> details = new HashMap<>();
        details.put("iban", "DE89370400440532013000");
        details.put("paymentPurpose", "Invoice Payment");

        BankTransfer bankTransfer = new BankTransfer(details);

        assertNotNull(bankTransfer, "BankTransfer object should not be null");
    }

    @Test
    void testProcessPayment() {
        Map<String, String> details = new HashMap<>();
        details.put("iban", "DE89370400440532013000");
        details.put("paymentPurpose", "Invoice Payment");

        BankTransfer bankTransfer = new BankTransfer(details);
        double amount = 100.50;

        bankTransfer.processPayment(amount);

    }

    @Test
    void testMissingDetails() {
        Map<String, String> incompleteDetails = new HashMap<>();
        incompleteDetails.put("iban", "DE89370400440532013000");

        BankTransfer bankTransfer = new BankTransfer(incompleteDetails);

        assertNotNull(bankTransfer);
        assertDoesNotThrow(() -> bankTransfer.processPayment(100.00),
                "Method should not throw exceptions for missing payment purpose");
    }
}
