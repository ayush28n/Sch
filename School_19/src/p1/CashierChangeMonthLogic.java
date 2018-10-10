package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;


public class CashierChangeMonthLogic
{
	PreparedStatement ps,ps1;
	String MonthYear;

public String getMonthYear() {
		return MonthYear;
	}

	public void setMonthYear(String monthYear) {
		MonthYear = monthYear;
	}

public String execute() 
{
	ResultSet rs1;
	try 
	{
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("update current set cdate =? where name =?");	
		ps1 = con.prepareStatement("select * from current where name = ?");
		ps1.setString(1,"current");
		rs1 = ps1.executeQuery();
		HttpSession sess = ServletActionContext.getRequest().getSession();

		
		if(rs1.next())
		{
		String currentdate =  rs1.getString("cdate");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate cdate = LocalDate.parse(currentdate, formatter);
		LocalDate UpdatedDate = cdate.plusMonths(1);
		
		String MonthName = UpdatedDate.getMonth().name();
		int CurrentYear = UpdatedDate.getYear();
		MonthYear = MonthName+" , "+CurrentYear;
		sess.setAttribute("MonthYear", MonthYear);
		String UpdatedDateString = UpdatedDate.toString();
		ps.setString(1, UpdatedDateString);
		ps.setString(2,"current");
		ps.executeUpdate();
		}
	}
		
		catch(Exception e)
		{
		System.out.println(e);
		return "wronguser";
		}
	return "success";
}
}
