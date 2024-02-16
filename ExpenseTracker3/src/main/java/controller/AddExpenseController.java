package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InsertDao;
import dto.Expense;
import dto.Person;



@WebServlet("/add")
public class AddExpenseController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id=Integer.parseInt(req.getParameter("id"));
		String date=req.getParameter("date");
		String category=req.getParameter("category");
		double amount=Double.parseDouble(req.getParameter("amount"));
		
		
		Expense expenses=new Expense();
		
		expenses.setE_personId(id);
		expenses.setExpenseDate(date);
		expenses.setExpenseCategory(category);
		expenses.setExpenseAmount(amount);
		
		InsertDao insertDao=new InsertDao();
		Person person=insertDao.fetchPersonById(id);
		
		expenses.setPerson(person);
		
		Expense expenses2=insertDao.insertExpenses(expenses);
		
		if(expenses2!=null)
		{
			req.setAttribute("id", id);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Success.jsp");
			requestDispatcher.forward(req, resp);
		}
		
	}
}
