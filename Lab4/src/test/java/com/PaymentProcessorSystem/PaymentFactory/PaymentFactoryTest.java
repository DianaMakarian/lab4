package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentFactory.*;
import com.PaymentProcessorSystem.PaymentMethod.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    @Test
    void testPayPalFactory() {
        // Arrange
        PaymentFactory factory = new PayPalFactory();
        Map<String, String> details = new HashMap<>();
        details.put("email", "test@example.com");
        details.put("password", "securepassword");

        // Act
        PaymentMethod payment = factory.createPayment(details);

        // Assert
        assertNotNull(payment);
        assertTrue(payment instanceof PayPal, "Expected instance of PayPal");
    }

    @Test
    void testCreditCardFactory() {
        // Arrange
        PaymentFactory factory = new CreditCardFactory();
        Map<String, String> details = new HashMap<>();
        details.put("cardNumber", "4111111111111111");
        details.put("expirationDate", "12/25");
        details.put("cvv", "123");
        details.put("nameOnCard", "John Doe");

        // Act
        PaymentMethod payment = factory.createPayment(details);

        // Assert
        assertNotNull(payment);
        assertTrue(payment instanceof CreditCard, "Expected instance of CreditCard");
    }

    @Test
    void testBankTransferFactory() {
        // Arrange
        PaymentFactory factory = new BankTransferFactory();
        Map<String, String> details = new HashMap<>();
        details.put("iban", "DE89370400440532013000");
        details.put("paymentPurpose", "Invoice Payment");

        // Act
        PaymentMethod payment = factory.createPayment(details);

        // Assert
        assertNotNull(payment);
        assertTrue(payment instanceof BankTransfer, "Expected instance of BankTransfer");
    }

    @Test
    void testMissingDetails() {
        // Arrange
        PaymentFactory factory = new PayPalFactory();
        Map<String, String> incompleteDetails = new HashMap<>();
        incompleteDetails.put("email", "test@example.com");

        // Act
        PaymentMethod payment = factory.createPayment(incompleteDetails);

        // Assert
        assertNotNull(payment, "Payment object should be created even with incomplete details");
        assertTrue(payment instanceof PayPal, "Expected instance of PayPal");
    }
}