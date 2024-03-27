package abc.lab.faris.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PatientTest {

    @Test
    void testPatientIntStringStringIntStringStringStringStringString() {
        Patient patient = new Patient(1, "Faris", "Faris@example.com", 123456789, "kandy", "Male", "fsris", "password", "None");
        assertEquals(1, patient.getIdPatient());
        assertEquals("Faris", patient.getFullName());
        assertEquals("Faris@example.com", patient.getEmail());
        assertEquals(123456789, patient.getPhoneNumber());
        assertEquals("kandy", patient.getAddress());
        assertEquals("Male", patient.getGender());
        assertEquals("fsris", patient.getUserName());
        assertEquals("password", patient.getPassword());
        assertEquals("None", patient.getMedicalProblem());
    }

    @Test
    void testPatientStringStringIntStringStringStringStringString() {
        Patient patient = new Patient("Faris", "Faris@example.com", 123456789, "kandy", "Male", "fsris", "password", "None");
        assertEquals("Faris", patient.getFullName());
        assertEquals("Faris@example.com", patient.getEmail());
        assertEquals(123456789, patient.getPhoneNumber());
        assertEquals("kandy", patient.getAddress());
        assertEquals("Male", patient.getGender());
        assertEquals("fsris", patient.getUserName());
        assertEquals("password", patient.getPassword());
        assertEquals("None", patient.getMedicalProblem());
    }

    @Test
    void testPatient() {
        Patient patient = new Patient();
        assertNotNull(patient);
    }

    @Test
    void testGetIdPatient() {
        Patient patient = new Patient();
        patient.setIdPatient(1);
        assertEquals(1, patient.getIdPatient());
    }

    @Test
    void testSetIdPatient() {
        Patient patient = new Patient();
        patient.setIdPatient(1);
        assertEquals(1, patient.getIdPatient());
    }

    @Test
    void testGetFullName() {
        Patient patient = new Patient();
        patient.setFullName("Faris");
        assertEquals("Faris", patient.getFullName());
    }

    @Test
    void testSetFullName() {
        Patient patient = new Patient();
        patient.setFullName("Faris");
        assertEquals("Faris", patient.getFullName());
    }

    @Test
    void testGetEmail() {
        Patient patient = new Patient();
        patient.setEmail("Faris@example.com");
        assertEquals("Faris@example.com", patient.getEmail());
    }

    @Test
    void testSetEmail() {
        Patient patient = new Patient();
        patient.setEmail("Faris@example.com");
        assertEquals("Faris@example.com", patient.getEmail());
    }

    @Test
    void testGetPhoneNumber() {
        Patient patient = new Patient();
        patient.setPhoneNumber(123456789);
        assertEquals(123456789, patient.getPhoneNumber());
    }

    @Test
    void testSetPhoneNumber() {
        Patient patient = new Patient();
        patient.setPhoneNumber(123456789);
        assertEquals(123456789, patient.getPhoneNumber());
    }

    @Test
    void testGetAddress() {
        Patient patient = new Patient();
        patient.setAddress("123 Main St");
        assertEquals("123 Main St", patient.getAddress());
    }

    @Test
    void testSetAddress() {
        Patient patient = new Patient();
        patient.setAddress("kandy");
        assertEquals("kandy", patient.getAddress());
    }

    @Test
    void testGetGender() {
        Patient patient = new Patient();
        patient.setGender("Male");
        assertEquals("Male", patient.getGender());
    }

    @Test
    void testSetGender() {
        Patient patient = new Patient();
        patient.setGender("Male");
        assertEquals("Male", patient.getGender());
    }

    @Test
    void testGetUserName() {
        Patient patient = new Patient();
        patient.setUserName("fsris");
        assertEquals("fsris", patient.getUserName());
    }

    @Test
    void testSetUserName() {
        Patient patient = new Patient();
        patient.setUserName("fsris");
        assertEquals("fsris", patient.getUserName());
    }

    @Test
    void testGetPassword() {
        Patient patient = new Patient();
        patient.setPassword("password");
        assertEquals("password", patient.getPassword());
    }

    @Test
    void testSetPassword() {
        Patient patient = new Patient();
        patient.setPassword("password");
        assertEquals("password", patient.getPassword());
    }

    @Test
    void testGetMedicalProblem() {
        Patient patient = new Patient();
        patient.setMedicalProblem("None");
        assertEquals("None", patient.getMedicalProblem());
    }

    @Test
    void testSetMedicalProblem() {
        Patient patient = new Patient();
        patient.setMedicalProblem("None");
        assertEquals("None", patient.getMedicalProblem());
    }
}
