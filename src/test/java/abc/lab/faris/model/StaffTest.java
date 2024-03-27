package abc.lab.faris.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaffTest {

    @Test
    void testStaffIntStringString() {
        Staff staff = new Staff(1, "Faris", "Description");
        assertEquals(1, staff.getStaffId());
        assertEquals("Faris", staff.getName());
        assertEquals("Description", staff.getDescription());
    }

    @Test
    void testStaffStringString() {
        Staff staff = new Staff("Faris", "Description");
        assertEquals("Faris", staff.getName());
        assertEquals("Description", staff.getDescription());
    }

    @Test
    void testStaff() {
        Staff staff = new Staff();
        assertNotNull(staff);
    }

    @Test
    void testGetStaffId() {
        Staff staff = new Staff();
        staff.setStaffId(1);
        assertEquals(1, staff.getStaffId());
    }

    @Test
    void testSetStaffId() {
        Staff staff = new Staff();
        staff.setStaffId(1);
        assertEquals(1, staff.getStaffId());
    }

    @Test
    void testGetName() {
        Staff staff = new Staff();
        staff.setName("Faris");
        assertEquals("Faris", staff.getName());
    }

    @Test
    void testSetName() {
        Staff staff = new Staff();
        staff.setName("Faris");
        assertEquals("Faris", staff.getName());
    }

    @Test
    void testGetDescription() {
        Staff staff = new Staff();
        staff.setDescription("Description");
        assertEquals("Description", staff.getDescription());
    }

    @Test
    void testSetDescription() {
        Staff staff = new Staff();
        staff.setDescription("Description");
        assertEquals("Description", staff.getDescription());
    }
}
