package abc.lab.faris.service;

import abc.lab.faris.dao.StaffManager;
import abc.lab.faris.model.Staff;

import java.sql.SQLException;
import java.util.List;

public class StaffService {

    private static StaffService staffServiceObj;

    private StaffService() {

    }

    public static synchronized StaffService getStaffServiceInstance() {
        if (staffServiceObj == null) {
            staffServiceObj = new StaffService();
        }
        return staffServiceObj;
    }

    private StaffManager getStaffManager() {
        return new StaffManager();
    }

    // services ---------------------------
    public boolean registerStaff(Staff staff) throws ClassNotFoundException, SQLException {
        return getStaffManager().addStaff(staff);
    }

    public Staff getSpecificStaff(int staffId) throws ClassNotFoundException, SQLException {
        return getStaffManager().getSpecificStaff(staffId);
    }

    public List<Staff> getAllStaff() throws ClassNotFoundException, SQLException {
        return getStaffManager().getAllStaff();
    }

    public boolean editTheStaff(Staff staff) throws ClassNotFoundException, SQLException {
        return getStaffManager().updateStaff(staff);
    }

    public boolean deleteTheStaff(int staffId) throws ClassNotFoundException, SQLException {
        return getStaffManager().deleteStaff(staffId);
    }
}
