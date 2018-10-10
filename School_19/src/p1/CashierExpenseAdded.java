package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class CashierExpenseAdded 
{
	private String description,ExpenseType;
	private float amount;
	PreparedStatement ps,ps1;
	HttpSession sesscash = ServletActionContext.getRequest().getSession();
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public String getExpenseType() {
		return ExpenseType;
	}

	public void setExpenseType(String expenseType) {
		ExpenseType = expenseType;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String execute()
	{
	LocalDate ld = LocalDate.now();
	LocalTime lt = LocalTime.now();
	String ldString = ld.toString();
	String ltString = lt.toString();
	String CashierID = (String) sesscash.getAttribute("CashierID");
	try 
	{
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("insert into expenses (type,date,time,amount,description,cashier) values(?,?,?,?,?,?)");
		ps.setString(1,ExpenseType);
		ps.setString(2,ldString);
		ps.setString(3,ltString);
		ps.setFloat(4,amount);
		ps.setString(5,description);
		ps.setString(6,CashierID);
		ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return "success";
	}
}
