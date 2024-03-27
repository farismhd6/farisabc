package abc.lab.faris.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaymentTest {

    @Test
    void testPaymentIntIntDoubleStringIntInt() {
        Payment payment = new Payment(1, 123, 100.0, "2024-03-25", 123456789, 123);
        assertEquals(1, payment.getIdPayment());
        assertEquals(123, payment.getPatientID());
        assertEquals(100.0, payment.getAmount());
        assertEquals("2024-03-25", payment.getPaymentDate());
        assertEquals(123456789, payment.getCardNo());
        assertEquals(123, payment.getCvcNo());
    }

    @Test
    void testPaymentIntDoubleStringIntInt() {
        Payment payment = new Payment(123, 100.0, "2024-03-25", 123456789, 123);
        assertEquals(123, payment.getPatientID());
        assertEquals(100.0, payment.getAmount());
        assertEquals("2024-03-25", payment.getPaymentDate());
        assertEquals(123456789, payment.getCardNo());
        assertEquals(123, payment.getCvcNo());
    }

    @Test
    void testPayment() {
        Payment payment = new Payment();
        assertNotNull(payment);
    }

    @Test
    void testGetIdPayment() {
        Payment payment = new Payment();
        payment.setIdPayment(1);
        assertEquals(1, payment.getIdPayment());
    }

    @Test
    void testSetIdPayment() {
        Payment payment = new Payment();
        payment.setIdPayment(1);
        assertEquals(1, payment.getIdPayment());
    }

    @Test
    void testGetPatientID() {
        Payment payment = new Payment();
        payment.setPatientID(123);
        assertEquals(123, payment.getPatientID());
    }

    @Test
    void testSetPatientID() {
        Payment payment = new Payment();
        payment.setPatientID(123);
        assertEquals(123, payment.getPatientID());
    }

    @Test
    void testGetAmount() {
        Payment payment = new Payment();
        payment.setAmount(100.0);
        assertEquals(100.0, payment.getAmount());
    }

    @Test
    void testSetAmount() {
        Payment payment = new Payment();
        payment.setAmount(100.0);
        assertEquals(100.0, payment.getAmount());
    }

    @Test
    void testGetPaymentDate() {
        Payment payment = new Payment();
        payment.setPaymentDate("2024-03-25");
        assertEquals("2024-03-25", payment.getPaymentDate());
    }

    @Test
    void testSetPaymentDate() {
        Payment payment = new Payment();
        payment.setPaymentDate("2024-03-25");
        assertEquals("2024-03-25", payment.getPaymentDate());
    }

    @Test
    void testGetCardNo() {
        Payment payment = new Payment();
        payment.setCardNo(123456789);
        assertEquals(123456789, payment.getCardNo());
    }

    @Test
    void testSetCardNo() {
        Payment payment = new Payment();
        payment.setCardNo(123456789);
        assertEquals(123456789, payment.getCardNo());
    }

    @Test
    void testGetCvcNo() {
        Payment payment = new Payment();
        payment.setCvcNo(123);
        assertEquals(123, payment.getCvcNo());
    }

    @Test
    void testSetCvcNo() {
        Payment payment = new Payment();
        payment.setCvcNo(123);
        assertEquals(123, payment.getCvcNo());
    }
}
