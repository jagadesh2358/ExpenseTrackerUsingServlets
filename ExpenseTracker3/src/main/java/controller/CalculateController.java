package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Expense;

@WebServlet("/cal")
public class CalculateController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		double total=Double.parseDouble(req.getParameter("val"));
		
		req.setAttribute("total", total);
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("Total.jsp");
		requestDispatcher.forward(req, resp);
	}
}
