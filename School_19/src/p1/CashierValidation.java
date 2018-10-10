package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;


public class CashierValidation
{
	PreparedStatement ps,ps1;
	
private String username,password;


public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String execute() 
{
	String cashauth = "UnvalidCashier";
	try 
	{
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("select * from cashier where username = ?");	
		ps.setString(1,username);
		ResultSet rs = ps.executeQuery();
		HttpSession sesscash = ServletActionContext.getRequest().getSession();
		
		if(rs.next())
		{
			String n = rs.getString("password");
			String NameOfCashier = rs.getString("name");

			if(password.equals(n))
			{
				cashauth= "ValidCashier";
				String CashRole = rs.getString("role");
				System.out.println("loggedin");
				System.out.println(cashauth);
				sesscash.setAttribute("cashrole", CashRole);
				sesscash.setAttribute("cashauth", cashauth);
				sesscash.setAttribute("NameOfCashier", NameOfCashier);
				sesscash.setAttribute("CashierID",username);
				return "success";
			}
				
			else
			{
				return "WrongCashPass";
			}
		}
			else
			{
				return "WrongCashUser";
			}				
	
	}
		
		catch(Exception e)
		{
		System.out.println(e);
		return "wronguser";
		}
	
}
}
