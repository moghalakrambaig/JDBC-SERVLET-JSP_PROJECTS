package com.ak.newserv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		HttpSession session = request.getSession();
		session .setAttribute("user_name", "AkramBaig");

		if (userName.equals("AkramBaig") && password.equals("akram111")) {
			RequestDispatcher rd = request.getRequestDispatcher("/homepage.jsp");
			out.print("Hello: " + userName);
			rd.forward(request, response);

		} else {
			out.print("Wrong Username or Password!");
		}
	}
}
