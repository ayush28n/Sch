package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;


public class LoginAction
{
	PreparedStatement ps,ps1;
	
private String user,pass;

public String getUser() {
	return user;
}

public void setUser(String user) {
	this.user = user;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

public String execute() 
{
	String auth = "InvalidUser";
	ResultSet rs2;
	try 
	{
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("select * from user where username = ?");	
		ps1 = con.prepareStatement("select * from current where name = ?");
		ps.setString(1,user);
		ps1.setString(1,"current");
		ResultSet rs = ps.executeQuery();
		rs2 = ps1.executeQuery();
		HttpSession sess = ServletActionContext.getRequest().getSession();
		sess.setAttribute("auth", auth);
		if(rs2.next())
		{
		String currentdate =  rs2.getString("cdate");
		String AYearF =  rs2.getString("yearf");
		String AYearE =  rs2.getString("yeare");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate cdate = LocalDate.parse(currentdate, formatter);
		String MonthName = cdate.getMonth().name();
		int CurrentYear = cdate.getYear();
		String MonthYear = MonthName+" , "+CurrentYear;
		String AcademicYear = AYearF+" - "+AYearE;
		sess.setAttribute("MonthYear", MonthYear);
		sess.setAttribute("AcademicYear", AcademicYear);
	
		}
		if(rs.next())
		{
			String n = rs.getString("password");
			String NameOfUser = rs.getString("name");

			if(pass.equals(n))
			{
				auth= "ValidUser";
				System.out.println("loggedin");
				sess.setAttribute("auth", auth);
				sess.setAttribute("NameOfUser", NameOfUser);
				sess.setAttribute("UserLoginID", user);
				return "success";
			}
				
			else
			{
				return "wrongpass";
			}
		}
			else
			{
				return "wronguser";
			}				
	
	}
		
		catch(Exception e)
		{
		System.out.println(e);
		return "wronguser";
		}
	
}
}
