
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter pw = response.getWriter();
		pw.println("Invalid Request!!!");
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");

		String fName = request.getParameter("fNameTxt");
		String lName = request.getParameter("lNameTxt");
		String designation = request.getParameter("designationTxt");
		
		if(fName.equals("")||lName.equals("")||designation.equals("")) {
			pw.println("<h3>Please fill all the required fields!!</h3>");
		}else {
			pw.println("<h3>Hello! This is a simple JSP/Servlet Program</h3>");
			pw.println("<p>Welcome " + fName + " " + lName + "</p>");
			pw.println("You are registered as " + designation);			
		}		
		pw.close();

	}

}
