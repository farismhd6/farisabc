package abc.lab.faris.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestResultTest {

    @Test
    void testTestResultIntIntStringByteArray() {
        byte[] report = new byte[] { 0x01, 0x02, 0x03 };
        TestResult testResult = new TestResult(1, 123, "Positive", report);
        assertEquals(1, testResult.getResultID());
        assertEquals(123, testResult.getAppointmentID());
        assertEquals("Positive", testResult.getResult());
        assertArrayEquals(report, testResult.getReport());
    }

    @Test
    void testTestResultIntStringByteArray() {
        byte[] report = new byte[] { 0x01, 0x02, 0x03 };
        TestResult testResult = new TestResult(123, "Negative", report);
        assertEquals(123, testResult.getAppointmentID());
        assertEquals("Negative", testResult.getResult());
        assertArrayEquals(report, testResult.getReport());
    }

    @Test
    void testTestResult() {
        TestResult testResult = new TestResult();
        assertNotNull(testResult);
    }

    @Test
    void testGetResultID() {
        TestResult testResult = new TestResult();
        testResult.setResultID(1);
        assertEquals(1, testResult.getResultID());
    }

    @Test
    void testSetResultID() {
        TestResult testResult = new TestResult();
        testResult.setResultID(1);
        assertEquals(1, testResult.getResultID());
    }

    @Test
    void testGetAppointmentID() {
        TestResult testResult = new TestResult();
        testResult.setAppointmentID(123);
        assertEquals(123, testResult.getAppointmentID());
    }

    @Test
    void testSetAppointmentID() {
        TestResult testResult = new TestResult();
        testResult.setAppointmentID(123);
        assertEquals(123, testResult.getAppointmentID());
    }

    @Test
    void testGetResult() {
        TestResult testResult = new TestResult();
        testResult.setResult("Positive");
        assertEquals("Positive", testResult.getResult());
    }

    @Test
    void testSetResult() {
        TestResult testResult = new TestResult();
        testResult.setResult("Positive");
        assertEquals("Positive", testResult.getResult());
    }

    @Test
    void testGetReport() {
        byte[] report = new byte[] { 0x01, 0x02, 0x03 };
        TestResult testResult = new TestResult();
        testResult.setReport(report);
        assertArrayEquals(report, testResult.getReport());
    }

    @Test
    void testSetReport() {
        byte[] report = new byte[] { 0x01, 0x02, 0x03 };
        TestResult testResult = new TestResult();
        testResult.setReport(report);
        assertArrayEquals(report, testResult.getReport());
    }
}
