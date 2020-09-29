package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SumServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		try {
			int fnumber = Integer.parseInt(req.getParameter("fnumber"));
			int snumber = Integer.parseInt(req.getParameter("snumber"));
			int sum = fnumber + snumber;
			out.print(String.valueOf(sum));
		} catch (NumberFormatException e) {
			out.print("Enter valid numbers");
		}

	}
}
