package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Failed extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		// out.print("<h1 style=\"color: red\">Login Failed</h1>");
		// out.println("<h5>Redirected to failed page</h5>");
		// out.print("<a href=\"login.html\">Go back to login page</h1>");

		out.print("<h1 style=\"color: red\">Login Failed</h1>");
		RequestDispatcher rd = req.getRequestDispatcher("/login.html");
		rd.include(req, resp);

	}

}
