package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InsertDao;
import dto.Person;


@WebServlet("/signup")
public class SignupController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		String address=req.getParameter("address");
		long phone=Long.parseLong(req.getParameter("phone"));
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		
		Person person=new Person();
		person.setPersonName(name);
		person.setPersonAge(age);
		person.setPersonAddress(address);
		person.setPersonPhoneNumber(phone);
		person.setPersonEmail(email);
		person.setPersonPassword(password);
		
		InsertDao insertDao=new InsertDao();
		Person person2=null;
		
		try
		{
			person2=insertDao.insertPerson(person);
			if(person2!=null)
			{
					RequestDispatcher requestDispatcher=req.getRequestDispatcher("Login.jsp");
				    requestDispatcher.forward(req, resp);
			}

		}
		
		catch (Exception e)
		{
			req.setAttribute("message", "Either phone number or email is already used.");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Signup.jsp");
		    requestDispatcher.forward(req, resp);

			
		}
		
		
//		if(person2!=null)
//		{
//			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Login.jsp");
//		    requestDispatcher.forward(req, resp);
//		}
//		else
//		{
//			req.setAttribute("message", "Either phone number or email is already used.");
//			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Signup.jsp");
//		    requestDispatcher.forward(req, resp);
//		}

	}
}
