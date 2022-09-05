package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import handler.LocalDB;
import model.User;

@WebServlet(value = "/signIn")
public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String uname = req.getParameter("userNameTxt");
		String email = req.getParameter("emailTxt");
		String password = req.getParameter("passwordTxt");
		
		LocalDB db = LocalDB.getSingletonObj();
		
		User newUser = new User(uname, email, password);
		db.addUser(newUser);
		resp.sendRedirect("login.jsp");
	}

}
