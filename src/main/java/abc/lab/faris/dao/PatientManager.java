package abc.lab.faris.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import abc.lab.faris.model.Patient;

public class PatientManager {
	public DbConnector getDbConnector() {
        DbConnectorFactory factory = new MySqlDbConnectorFactoryImpl();
        return factory.getDbConnector();
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        DbConnector connector = getDbConnector();
        return connector.getDbConnection();
    }

    public boolean addPatient(Patient patient) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        String query = "INSERT INTO patient (fullName, email, phoneNumber, address, gender, userName, password, medicalProblem) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, patient.getFullName());
        ps.setString(2, patient.getEmail());
        ps.setInt(3, patient.getPhoneNumber());
        ps.setString(4, patient.getAddress());
        ps.setString(5, patient.getGender());
        ps.setString(6, patient.getUserName());
        ps.setString(7, patient.getPassword());
        ps.setString(8, patient.getMedicalProblem());

        int result = ps.executeUpdate();

        ps.close();
        connection.close();
        return result > 0;
    }

    public Patient getSpecificPatient(int idPatient) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        String query = "SELECT * FROM patient WHERE idPatient = ?";

        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, idPatient);

        ResultSet rs = ps.executeQuery();
        Patient patient = new Patient();

        while (rs.next()) {
            patient.setIdPatient(rs.getInt("idPatient"));
            patient.setFullName(rs.getString("fullName"));
            patient.setEmail(rs.getString("email"));
            patient.setPhoneNumber(rs.getInt("phoneNumber"));
            patient.setAddress(rs.getString("address"));
            patient.setGender(rs.getString("gender"));
            patient.setUserName(rs.getString("userName"));
            patient.setPassword(rs.getString("password"));
            patient.setMedicalProblem(rs.getString("medicalProblem"));
        }

        ps.close();
        connection.close();
        return patient;
    }

    public List<Patient> getAllPatients() throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        List<Patient> patientList = new ArrayList<>();

        String query = "SELECT * FROM patient";

        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            Patient patient = new Patient();
            patient.setIdPatient(rs.getInt("idPatient"));
            patient.setFullName(rs.getString("fullName"));
            patient.setEmail(rs.getString("email"));
            patient.setPhoneNumber(rs.getInt("phoneNumber"));
            patient.setAddress(rs.getString("address"));
            patient.setGender(rs.getString("gender"));
            patient.setUserName(rs.getString("userName"));
            patient.setPassword(rs.getString("password"));
            patient.setMedicalProblem(rs.getString("medicalProblem"));

            patientList.add(patient);
        }

        st.close();
        connection.close();

        return patientList;
    }

    public boolean updatePatient(Patient patient) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        String query = "UPDATE patient SET fullName = ?, email = ?, phoneNumber = ?, address = ?, gender = ?, userName = ?, password = ?, medicalProblem = ? WHERE idPatient = ?";

        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, patient.getFullName());
        ps.setString(2, patient.getEmail());
        ps.setInt(3, patient.getPhoneNumber());
        ps.setString(4, patient.getAddress());
        ps.setString(5, patient.getGender());
        ps.setString(6, patient.getUserName());
        ps.setString(7, patient.getPassword());
        ps.setString(8, patient.getMedicalProblem());
        ps.setInt(9, patient.getIdPatient());

        int result = ps.executeUpdate();

        ps.close();
        connection.close();
        return result > 0;
    }

    public boolean deletePatient(int idPatient) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        String query = "DELETE FROM patient WHERE idPatient = ?";

        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, idPatient);
        int result = ps.executeUpdate();

        ps.close();
        connection.close();
        return result > 0;
    }
    public boolean validatePatientCredentials(String username, String password) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        String query = "SELECT * FROM patient WHERE Username = ? AND Password = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        boolean isValid = rs.next(); // If result set has next, it means credentials are valid
        ps.close();
        connection.close();
        return isValid;
    }


}
