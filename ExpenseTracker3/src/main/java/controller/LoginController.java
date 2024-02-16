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
import dto.Person;

@WebServlet("/login")
public class LoginController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String frontEndEmail=req.getParameter("email");
		String frontEndPassword=req.getParameter("password");
		
		InsertDao insertDao=new InsertDao();
		Person dbPerson=insertDao.fetchByEmail(frontEndEmail);
		
		
		if(dbPerson.getPersonEmail().equals(frontEndEmail) && dbPerson.getPersonPassword().equals(frontEndPassword))
		{
			req.setAttribute("person", dbPerson);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("functions.jsp");
			requestDispatcher.forward(req, resp);
		}
		
		else
		{
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Login.jsp");
			requestDispatcher.forward(req, resp);
		}
		
	}
}
