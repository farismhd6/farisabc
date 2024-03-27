package abc.lab.faris.service;

import java.sql.SQLException;

import abc.lab.faris.dao.RegisterPatientManager;
import abc.lab.faris.model.Patient;

public class RegisterPatientService {
	private static RegisterPatientService registerpatientServiceObj;

    private RegisterPatientService() {

    }

    public static synchronized RegisterPatientService getRegisterpatientServiceInstance() {

        if (registerpatientServiceObj == null) {
        	registerpatientServiceObj = new RegisterPatientService();
        }

        return registerpatientServiceObj;
    }
    private RegisterPatientManager getRegisterPatientMnager() {
        return new RegisterPatientManager();
    }
    
    public boolean registerPatient(Patient patient) throws ClassNotFoundException, SQLException {
        return getRegisterPatientMnager().addPatient(patient);
    }


}
