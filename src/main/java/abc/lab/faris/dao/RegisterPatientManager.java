package abc.lab.faris.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import abc.lab.faris.model.Patient;


public class RegisterPatientManager {
	
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

}
