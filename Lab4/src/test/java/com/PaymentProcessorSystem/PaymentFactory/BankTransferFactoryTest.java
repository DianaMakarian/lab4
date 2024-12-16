package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BankTransferFactoryTest {
    @Test
    void testCreateBankTransfer() {
        PaymentFactory factory = new BankTransferFactory();
        Map<String, String> details = Map.of(
                "iban", "DE89370400440532013000",
                "paymentPurpose", "Invoice Payment"
        );

        PaymentMethod payment = factory.createPayment(details);

        assertNotNull(payment, "Payment object should not be null");
    }
}