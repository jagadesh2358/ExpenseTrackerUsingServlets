package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Expense;
import dto.Person;



public class InsertDao
{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Jagadesh");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();


	public Person insertPerson(Person person)
	{
		entityTransaction.begin();
		
		entityManager.persist(person);
		
		entityTransaction.commit();
		
		return person;
	}
	
	public Expense insertExpenses(Expense expenses)
	{
		entityTransaction.begin();

		entityManager.persist(expenses);

		entityTransaction.commit();

		return expenses;
	}
	
	public Person fetchByEmail(String email)
	{
		Query query = entityManager.createQuery("select p from Person p where p.personEmail=?1");
		query.setParameter(1, email);
		Person person = (Person) query.getSingleResult();
		return person;
	}
	
	public List<Expense> fetchExpensesByPersonId(int personId)
	{
		Query query=entityManager.createQuery("select e from Expense e where e.e_personId=?1");
		query.setParameter(1, personId);
		List<Expense> expenses=query.getResultList();
		return expenses;
	}
	
	public int fetchPersonIdByExpenseId(int expenseId)
	{
		Query query=entityManager.createQuery("select e.e_personId from Expense e where e.expenseId=?1");
		query.setParameter(1, expenseId);
		int id=(int) query.getSingleResult();
		return id;
	}
	
	public Person fetchPersonById(int id)
	{
		Person person=entityManager.find(Person.class, id);
		return person;
	}
	
	public boolean deleteExpense(int id)
	{
		Expense expense = entityManager.find(Expense.class, id);
		if (expense != null)
		{
			entityTransaction.begin();

			entityManager.remove(expense);

			entityTransaction.commit();
			
			return true;

		}
		
		return false;

	}
	
	public List<Expense> fetchAll(int id)
	{
//		Query query = entityManager.createQuery("select s from Student s");
//		List<Student> list = query.getResultList();
//		return list;
		
		Query query=entityManager.createQuery("select e from Expense e where e.");
		List<Expense> list=query.getResultList();
		return list;
	}
	
}
