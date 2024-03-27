package abc.lab.faris.model;

public class Patient {
	private int idPatient;
    private String fullName;
    private String email;
    private int phoneNumber;
    private String address;
    private String gender;
    private String userName;
    private String password;
    private String medicalProblem;
    
    public Patient(int idPatient, String fullName, String email, int phoneNumber, String address, String gender, String userName, String password, String medicalProblem) {
        this.idPatient = idPatient;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.userName = userName;
        this.password = password;
        this.medicalProblem = medicalProblem;
    }
    
    public Patient(String fullName, String email, int phoneNumber, String address, String gender, String userName, String password, String medicalProblem) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.userName = userName;
        this.password = password;
        this.medicalProblem = medicalProblem;
    }
    
    public Patient() {
        
    }
    
    public int getIdPatient() {
        return idPatient;
    }
    
    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getMedicalProblem() {
        return medicalProblem;
    }
    
    public void setMedicalProblem(String medicalProblem) {
        this.medicalProblem = medicalProblem;
    }


}
