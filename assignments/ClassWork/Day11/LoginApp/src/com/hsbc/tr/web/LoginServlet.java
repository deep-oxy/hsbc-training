package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("name");
		String password = req.getParameter("password");

		if (name.equals(password)) {
			// out.print("<h1 style=\"color: green\">Login Success</h1>");
			RequestDispatcher rd = req.getRequestDispatcher("/success");
			rd.forward(req, resp);
		} else {
			// out.print("<h1 style=\"color: red\">Login Failed</h1>");
			// out.print("<a href=\"login.html\">Go back to login page</h1>");
			// RequestDispatcher rd = req.getRequestDispatcher("/failed");
			// rd.forward(req, resp);
			// out.print("<h2 style=\"color: red\">Login Failed</h2>");
			// RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			// rd.include(req, resp);

			RequestDispatcher rd = req.getRequestDispatcher("/failed");
			rd.forward(req, resp);
		}

	}

}
