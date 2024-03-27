package abc.lab.faris.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import abc.lab.faris.model.Patient;
import abc.lab.faris.service.PatientService;

/**
 * Servlet implementation class PatientController
 */
@WebServlet("/patientController")

public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        PatientService patientService = PatientService.getPatientServiceInstance();

        if (type != null && type.equals("specific")) {
            getSpecificPatient(request, response, patientService);
        } else {
            getAllPatients(request, response, patientService);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        PatientService patientService = PatientService.getPatientServiceInstance();

        if (type != null && type.equals("update")) {
            updatePatient(request, response, patientService);
        } else if (type != null && type.equals("add")) {
            addPatient(request, response, patientService);
        } else if (type != null && type.equals("delete")) {
            deletePatient(request, response, patientService);
        }
    }

    private void getAllPatients(HttpServletRequest request, HttpServletResponse response, PatientService service) throws ServletException, IOException {
        String message = "";
        List<Patient> patientList;

        try {
            patientList = service.getAllPatients();
        } catch (ClassNotFoundException | SQLException e) {
            message = e.getMessage();
            patientList = new ArrayList<>();
        }

        request.setAttribute("message", message);
        request.setAttribute("patientList", patientList);

        RequestDispatcher rd = request.getRequestDispatcher("patient.jsp");
        rd.forward(request, response);
    }

    private void getSpecificPatient(HttpServletRequest request, HttpServletResponse response, PatientService service) throws ServletException, IOException {
        String patientIdStr = request.getParameter("patientId");
        int patientId;
        Patient patient;
        String message = "";

        if (patientIdStr != null && !patientIdStr.isEmpty()) {
            try {
                patientId = Integer.parseInt(patientIdStr);
                patient = service.getSpecificPatient(patientId);
            } catch (NumberFormatException | ClassNotFoundException | SQLException e) {
                message = e.getMessage();
                patient = new Patient();
            }
        } else {
            message = "Patient ID is missing or invalid.";
            patient = new Patient();
        }

        request.setAttribute("patient", patient);
        request.setAttribute("message", message);

        RequestDispatcher rd = request.getRequestDispatcher("SearchPatient.jsp");
        rd.forward(request, response);
    }

    private void updatePatient(HttpServletRequest request, HttpServletResponse response, PatientService service) throws ServletException, IOException {
        int patientId = Integer.parseInt(request.getParameter("patientId"));
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String medicalProblem = request.getParameter("medicalProblem");

        Patient patient = new Patient(patientId, fullName, email, phoneNumber, address, gender, userName, password, medicalProblem);

        boolean result;
        String message = "";
        try {
            result = service.editThePatient(patient);
            if (result) {
                message = "Patient with ID " + patientId + " has been successfully updated!";
            } else {
                message = "Failed to update the patient with ID: " + patientId;
            }
        } catch (ClassNotFoundException | SQLException e) {
            message = e.getMessage();
        }

        request.setAttribute("message", message);

        RequestDispatcher rd = request.getRequestDispatcher("SearchPatient.jsp");
        rd.forward(request, response);
    }

    private void addPatient(HttpServletRequest request, HttpServletResponse response, PatientService service) throws ServletException, IOException {
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String medicalProblem = request.getParameter("medicalProblem");

        Patient patient = new Patient(fullName, email, phoneNumber, address, gender, userName, password, medicalProblem);

        boolean result;
        String message = "";
        try {
            result = service.registerPatient(patient);
            if (result) {
                message = "Patient " + fullName + " has been successfully added!";
            } else {
                message = "Failed to add the patient: " + fullName;
            }
        } catch (ClassNotFoundException | SQLException e) {
            message = e.getMessage();
        }

        request.setAttribute("message", message);

        RequestDispatcher rd = request.getRequestDispatcher("PatientLogin.jsp");
        rd.forward(request, response);
    }

    private void deletePatient(HttpServletRequest request, HttpServletResponse response, PatientService service) throws ServletException, IOException {
        int patientId = Integer.parseInt(request.getParameter("patientId"));

        boolean result;
        String message = "";
        try {
            result = service.deleteThePatient(patientId);
            if (result) {
                message = "Patient with ID " + patientId + " has been successfully deleted!";
            } else {
                message = "Failed to delete the patient with ID: " + patientId;
            }
        } catch (ClassNotFoundException | SQLException e) {
            message = e.getMessage();
        }

        HttpSession session = request.getSession();

        try {
            List<Patient> patientList = service.getAllPatients();
            session.setAttribute("patientList", patientList);
        } catch (ClassNotFoundException | SQLException e) {
            message = e.getMessage();
        }

        session.setAttribute("message", message);
        response.sendRedirect("patient.jsp");
    }
}