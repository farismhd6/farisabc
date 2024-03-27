package abc.lab.faris.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import abc.lab.faris.model.Staff;

public class StaffManager {

    public DbConnector getDbConnector() {
        // Assuming similar implementation to AppointmentManager
        DbConnectorFactory factory = new MySqlDbConnectorFactoryImpl(); // if you can get this from config 
        return factory.getDbConnector();
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        DbConnector connector = getDbConnector();
        return connector.getDbConnection();
    }

    public boolean addStaff(Staff staff) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        String query = "INSERT INTO staff (Name, Description) VALUES (?, ?)";

        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, staff.getName());
        ps.setString(2, staff.getDescription());

        int result = ps.executeUpdate();

        ps.close();
        connection.close();
        return result > 0;
    }

    public Staff getSpecificStaff(int staffId) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        String query = "SELECT * FROM staff WHERE StaffId = ?";

        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, staffId);

        ResultSet rs = ps.executeQuery();
        Staff staff = new Staff();

        while (rs.next()) {
            staff.setStaffId(rs.getInt("StaffId"));
            staff.setName(rs.getString("Name"));
            staff.setDescription(rs.getString("Description"));
        }

        ps.close();
        connection.close();
        return staff;
    }

    public List<Staff> getAllStaff() throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        List<Staff> staffList = new ArrayList<>();

        String query = "SELECT * FROM staff";

        Statement st = connection.createStatement();

        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            Staff staff = new Staff();
            staff.setStaffId(rs.getInt("StaffId"));
            staff.setName(rs.getString("Name"));
            staff.setDescription(rs.getString("Description"));

            staffList.add(staff);
        }

        st.close();
        connection.close();

        return staffList;
    }

    public boolean updateStaff(Staff staff) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        String query = "UPDATE staff SET Name = ?, Description = ? WHERE StaffId = ?";

        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, staff.getName());
        ps.setString(2, staff.getDescription());
        ps.setInt(3, staff.getStaffId());

        int result = ps.executeUpdate();

        ps.close();
        connection.close();
        return result > 0;
    }

    public boolean deleteStaff(int staffId) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        String query = "DELETE FROM staff WHERE StaffId = ?";

        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, staffId);
        int result = ps.executeUpdate();

        ps.close();
        connection.close();
        return result > 0;
    }
}
