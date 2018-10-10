package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;


public class CashierChangePassFinal
{
	PreparedStatement ps,ps1;
	
private String user,oldpass,newpass;

	public String execute() 
	{
	try 
	{
		HttpSession sess = ServletActionContext.getRequest().getSession();
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("select * from cashier where username = ?");	
		ps1 = con.prepareStatement("update cashier set password = ? where username = ?");
		user = (String) sess.getAttribute("CashierID");
		ps.setString(1,user);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
		{
			String n = rs.getString("password");

			if(oldpass.equals(n))
			{
				ps1.setString(1,newpass);
				ps1.setString(2, user);
				ps1.executeUpdate();
				return "PassChanged";
			}
				
			else
			{
				return "WrongPassword";
			}
		}
		else 
		{
			return "WrongUser";
		}
							
	
	}
		
		catch(Exception e)
		{
		System.out.println(e);
		return "wronguser";
		}
	
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getOldpass() {
		return oldpass;
	}

	public void setOldpass(String oldpass) {
		this.oldpass = oldpass;
	}

	public String getNewpass() {
		return newpass;
	}

	public void setNewpass(String newpass) {
		this.newpass = newpass;
	}
	
}
