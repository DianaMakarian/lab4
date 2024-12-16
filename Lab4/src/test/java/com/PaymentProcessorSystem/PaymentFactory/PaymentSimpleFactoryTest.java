package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PaymentSimpleFactoryTest {

    @Test
    void testCreatePayPal() {
        Map<String, String> details = new HashMap<>();
        details.put("email", "test@example.com");
        details.put("password", "securepassword");

        PaymentMethod payment = PaymentSimpleFactory.createPayment("PayPal", details);

        assertNotNull(payment);
        assertInstanceOf(PayPal.class, payment, "Expected instance of PayPal");
    }

    @Test
    void testCreateCreditCard() {
        // Arrange
        Map<String, String> details = new HashMap<>();
        details.put("cardNumber", "4111111111111111");
        details.put("expirationDate", "12/25");
        details.put("cvv", "123");
        details.put("nameOnCard", "John Doe");

        // Act
        PaymentMethod payment = PaymentSimpleFactory.createPayment("CreditCard", details);

        // Assert
        assertNotNull(payment);
        assertInstanceOf(CreditCard.class, payment, "Expected instance of CreditCard");
    }

    @Test
    void testCreateBankTransfer() {
        // Arrange
        Map<String, String> details = new HashMap<>();
        details.put("iban", "DE89370400440532013000");
        details.put("paymentPurpose", "Invoice Payment");

        // Act
        PaymentMethod payment = PaymentSimpleFactory.createPayment("BankTransfer", details);

        // Assert
        assertNotNull(payment);
        assertInstanceOf(BankTransfer.class, payment, "Expected instance of BankTransfer");
    }

    @Test
    void testCreateUnknownPaymentMethod() {
        // Arrange
        Map<String, String> details = new HashMap<>();

        // Act & Assert
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PaymentSimpleFactory.createPayment("UnknownMethod", details),
                "Expected IllegalArgumentException for unknown payment method"
        );
        assertEquals("Unknown payment method: UnknownMethod", exception.getMessage());
    }
}