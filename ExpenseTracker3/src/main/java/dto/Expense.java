package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Expense
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int expenseId;
	private String expenseDate;
	private String expenseCategory;
	private double expenseAmount;
	private int e_personId;
	
	public int getE_personId() {
		return e_personId;
	}

	public void setE_personId(int e_personId) {
		this.e_personId = e_personId;
	}

	@ManyToOne
	private Person person;

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public String getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(String expenseDate) {
		this.expenseDate = expenseDate;
	}

	public String getExpenseCategory() {
		return expenseCategory;
	}

	public void setExpenseCategory(String expenseCategory) {
		this.expenseCategory = expenseCategory;
	}

	public double getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
}
