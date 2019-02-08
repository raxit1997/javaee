package com.zilker.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zilker.bean.Student;
import com.zilker.delegates.StudentDelegate;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("GET Request Served at: " + request.getLocalPort());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String firstName = request.getParameter("fname");
			String lastName = request.getParameter("lname");
			String deptName = request.getParameter("deptname");
			String regno = request.getParameter("regno");
			int year = Integer.parseInt(request.getParameter("year"));
			Student student = new Student(firstName, lastName, deptName, regno, year);
			StudentDelegate studentDelegate = new StudentDelegate();
			if (studentDelegate.insertStudent(student)) {
				request.setAttribute("name", firstName + " " + lastName);
				RequestDispatcher rd = request.getRequestDispatcher("./pages/success.jsp");
				rd.forward(request, response);
			} else {
				response.sendRedirect("./pages/error.jsp");
			}
		} catch (Exception e) {
			
		}
	}

}
