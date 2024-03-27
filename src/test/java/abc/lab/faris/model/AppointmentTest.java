package abc.lab.faris.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppointmentTest {

    @Test
    void testAppointmentIntIntStringStringString() {
        Appointment appointment = new Appointment(1, 123, "2025-07-25", "Suger Test", "Urgent");
        assertEquals(1, appointment.getAppointmentID());
        assertEquals(123, appointment.getPatientID());
        assertEquals("2025-07-25", appointment.getAppointmentDate());
        assertEquals("Suger Test", appointment.getTestName());
        assertEquals("Urgent", appointment.getAppointmentRequest());
    }

    @Test
    void testAppointmentIntStringStringString() {
        Appointment appointment = new Appointment(123, "2025-07-25", "Suger Test", "Urgent");
        assertEquals(123, appointment.getPatientID());
        assertEquals("2025-07-25", appointment.getAppointmentDate());
        assertEquals("Suger Test", appointment.getTestName());
        assertEquals("Urgent", appointment.getAppointmentRequest());
    }

    @Test
    void testAppointment() {
        Appointment appointment = new Appointment();
        assertNotNull(appointment);
    }

    @Test
    void testGetAppointmentID() {
        Appointment appointment = new Appointment();
        appointment.setAppointmentID(1);
        assertEquals(1, appointment.getAppointmentID());
    }

    @Test
    void testSetAppointmentID() {
        Appointment appointment = new Appointment();
        appointment.setAppointmentID(1);
        assertEquals(1, appointment.getAppointmentID());
    }

    @Test
    void testGetPatientID() {
        Appointment appointment = new Appointment();
        appointment.setPatientID(123);
        assertEquals(123, appointment.getPatientID());
    }

    @Test
    void testSetPatientID() {
        Appointment appointment = new Appointment();
        appointment.setPatientID(123);
        assertEquals(123, appointment.getPatientID());
    }

    @Test
    void testGetAppointmentDate() {
        Appointment appointment = new Appointment();
        appointment.setAppointmentDate("2025-07-25");
        assertEquals("2025-07-25", appointment.getAppointmentDate());
    }

    @Test
    void testSetAppointmentDate() {
        Appointment appointment = new Appointment();
        appointment.setAppointmentDate("2025-07-25");
        assertEquals("2025-07-25", appointment.getAppointmentDate());
    }

    @Test
    void testGetTestName() {
        Appointment appointment = new Appointment();
        appointment.setTestName("Suger Test");
        assertEquals("Suger Test", appointment.getTestName());
    }

    @Test
    void testSetTestName() {
        Appointment appointment = new Appointment();
        appointment.setTestName("Suger Test");
        assertEquals("Suger Test", appointment.getTestName());
    }

    @Test
    void testGetAppointmentRequest() {
        Appointment appointment = new Appointment();
        appointment.setAppointmentRequest("Urgent");
        assertEquals("Urgent", appointment.getAppointmentRequest());
    }

    @Test
    void testSetAppointmentRequest() {
        Appointment appointment = new Appointment();
        appointment.setAppointmentRequest("Urgent");
        assertEquals("Urgent", appointment.getAppointmentRequest());
    }
}
