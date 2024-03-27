package abc.lab.faris.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/receptionistlogincontroller")
public class ReceptionistLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String username = request.getParameter("username");
	        String password = request.getParameter("password");

	       
	        if ("Admin".equals(username) && "Admin".equals(password)) {
	            
	            response.sendRedirect("ReceptionistDashboard.jsp");
	        } else {
	          
	            request.setAttribute("errorMessage", "Invalid username or password");
	            request.getRequestDispatcher("ReceptionistLogin.jsp").forward(request, response);
	        }
	    }

}
