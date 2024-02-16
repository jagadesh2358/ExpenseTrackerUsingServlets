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


@WebServlet("/delete")
public class DeleteController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{

		
		int id=Integer.parseInt(req.getParameter("id"));
		InsertDao insertDao=new InsertDao();
		int personId=insertDao.fetchPersonIdByExpenseId(id);
		boolean result=insertDao.deleteExpense(id);
		
		if(result)
		{
			List<Expense> expenses=insertDao.fetchExpensesByPersonId(personId);
			req.setAttribute("msg", expenses);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Display.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
