package com.PaymentProcessorSystem.PaymentFactory;

import com.PaymentProcessorSystem.PaymentMethod.CreditCard;
import com.PaymentProcessorSystem.PaymentMethod.PaymentMethod;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentSimpleFactoryTest {
    @Test
    public void testCreateNewPayment() {
        PaymentSimpleFactory factory = new PaymentSimpleFactory();
        PaymentMethod payment = factory.createNewPayment("CreditCard");
        assertNotNull(payment);
        assertEquals(CreditCard.class, payment.getClass());
    }
}