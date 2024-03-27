package abc.lab.faris.controller;

import abc.lab.faris.model.Staff;
import abc.lab.faris.service.StaffService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StaffController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String type = request.getParameter("type");
        StaffService staffService = StaffService.getStaffServiceInstance();

        if (type != null && type.equals("specific")) {
            getSpecificStaff(request, response, staffService);
        } else {
            getAllStaff(request, response, staffService);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String type = request.getParameter("type");
        StaffService staffService = StaffService.getStaffServiceInstance();

        if (type != null && type.equals("update")) {
            updateStaff(request, response, staffService);
        } else if (type != null && type.equals("add")) {
            addStaff(request, response, staffService);
        } else if (type != null && type.equals("delete")) {
            deleteStaff(request, response, staffService);
        }
    }

    private void getAllStaff(HttpServletRequest request, HttpServletResponse response,
            StaffService service) throws ServletException, IOException {

        String message = "";
        List<Staff> staffList;

        try {
            staffList = service.getAllStaff();
        } catch (ClassNotFoundException | SQLException e) {
            message = e.getMessage();
            staffList = new ArrayList<>();
        }

        request.setAttribute("message", message);
        request.setAttribute("staffList", staffList);

        RequestDispatcher rd = request.getRequestDispatcher("Staff.jsp");
        rd.forward(request, response);
    }

    private void getSpecificStaff(HttpServletRequest request, HttpServletResponse response,
            StaffService service) throws ServletException, IOException {

        int staffId = Integer.parseInt(request.getParameter("staffId"));
        Staff staff;
        String message = "";
        try {
            staff = service.getSpecificStaff(staffId);
        } catch (ClassNotFoundException | SQLException e) {
            message = e.getMessage();
            staff = new Staff();
        }

        request.setAttribute("staff", staff);
        request.setAttribute("message", message);

        RequestDispatcher rd = request.getRequestDispatcher("SearchStaff.jsp");
        rd.forward(request, response);
    }

    private void updateStaff(HttpServletRequest request, HttpServletResponse response,
            StaffService service) throws ServletException, IOException {

        int staffId = Integer.parseInt(request.getParameter("staffId"));
        String name = request.getParameter("name");
        String description = request.getParameter("description");

        Staff staff = new Staff(staffId, name, description);

        boolean result;
        String message = "";
        try {
            result = service.editTheStaff(staff);
            if (result) {
                message = "Staff " + staffId + " has been successfully updated!";
            } else {
                message = "Failed to update the staff! Staff ID: " + staffId;
            }
        } catch (ClassNotFoundException | SQLException e) {
            message = e.getMessage();
        }

        request.setAttribute("message", message);

        RequestDispatcher rd = request.getRequestDispatcher("SearchStaff.jsp");
        rd.forward(request, response);
    }

    private void addStaff(HttpServletRequest request, HttpServletResponse response,
            StaffService service) throws ServletException, IOException {

        String name = request.getParameter("name");
        String description = request.getParameter("description");

        Staff staff = new Staff(name, description);

        boolean result;
        String message = "";
        try {
            result = service.registerStaff(staff);
            if (result) {
                message = "Staff " + name + " has been successfully added!";
            } else {
                message = "Failed to add the staff!";
            }
        } catch (ClassNotFoundException | SQLException e) {
            message = e.getMessage();
        }

        request.setAttribute("message", message);

        RequestDispatcher rd = request.getRequestDispatcher("addStaff.jsp");
        rd.forward(request, response);
    }

    private void deleteStaff(HttpServletRequest request, HttpServletResponse response,
            StaffService service) throws ServletException, IOException {

        int staffId = Integer.parseInt(request.getParameter("staffId"));

        boolean result;
        String message = "";
        try {
            result = service.deleteTheStaff(staffId);
            if (result) {
                message = "Staff ID " + staffId + " has been successfully deleted!";
            } else {
                message = "Failed to delete the staff! Staff ID: " + staffId;
            }
        } catch (ClassNotFoundException | SQLException e) {
            message = e.getMessage();
        }

        HttpSession session = request.getSession();

        try {
            List<Staff> staffList = service.getAllStaff();
            session.setAttribute("staffList", staffList);
        } catch (ClassNotFoundException | SQLException e) {
            message = e.getMessage();
        }

        session.setAttribute("message", message);
        response.sendRedirect("Staff.jsp");
    }
}
