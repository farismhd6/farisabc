package abc.lab.faris.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abc.lab.faris.model.Patient;
import abc.lab.faris.service.RegisterPatientService;

/**
 * Servlet implementation class RegisterPatientController
 */
@WebServlet("/patientregController")
public class RegisterPatientController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        RegisterPatientService registerPatientService = RegisterPatientService.getRegisterpatientServiceInstance();

        if ("add".equals(type)) {
            addPatient(request, response, registerPatientService);
 
        }
    }

    private void addPatient(HttpServletRequest request, HttpServletResponse response,
                            RegisterPatientService service) throws ServletException, IOException {
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String phoneNumberStr = request.getParameter("phoneNumber");
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String medicalProblem = request.getParameter("medicalProblem");

        int phoneNumber = 0;
        try {
            phoneNumber = Integer.parseInt(phoneNumberStr);
        } catch (NumberFormatException e) {
            // Log error or send error message back to form
            request.setAttribute("error", "Invalid phone number format.");
            forwardToForm(request, response);
            return; // Stop further execution
        }

        Patient patient = new Patient(fullName, email, phoneNumber, address, gender, userName, password, medicalProblem);

        String message;
        try {
            boolean result = service.registerPatient(patient);
            if (result) {
                message = "Patient " + fullName + " has been successfully added!";
            } else {
                message = "Failed to add the patient: " + fullName;
            }
        } catch (ClassNotFoundException | SQLException e) {
            // Log error
            message = "An error occurred while registering the patient: " + e.getMessage();
        }

        request.setAttribute("message", message);
        forwardToForm(request, response);
    }

    private void forwardToForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Registerpatient.jsp");
        rd.forward(request, response);
    }
}
