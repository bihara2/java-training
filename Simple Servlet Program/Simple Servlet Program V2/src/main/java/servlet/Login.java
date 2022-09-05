package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import handler.LocalDB;
import model.User;

@WebServlet(value = "/signUp")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("emailTxt");
		String password = req.getParameter("passwordTxt");

		User user = new User("", email, password);

		LocalDB db = LocalDB.getSingletonObj();

		User getUser = (User) db.getUser(email);

		System.out.println(user.equals(getUser));

		if (user.equals(getUser)) {
			HttpSession session = req.getSession();
			session.setAttribute("userEmail", email);
			resp.sendRedirect("home.jsp");

		} else {
			resp.sendRedirect("login.jsp");
		}

	}

}
