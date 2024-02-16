package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InsertDao;
import dto.Expense;

@WebServlet("/view")
public class DisplayController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		int id=Integer.parseInt(req.getParameter("btn"));
		
		InsertDao insertDao=new InsertDao();
		List<Expense> expenses=insertDao.fetchExpensesByPersonId(id);
		
		if(expenses!=null)
		{
			req.setAttribute("msg", expenses);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Display.jsp");
		    requestDispatcher.forward(req, resp);
		}
//		else
//		{
//			req.setAttribute("msg", id);
//			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Display.jsp");
//		    requestDispatcher.forward(req, resp);
//		}
	}
}
