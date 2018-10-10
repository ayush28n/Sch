package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class CashierChangeMonth 
{
	
	PreparedStatement ps,ps1,ps2;
	ResultSet rs;
	String CurrentMonth;
	

	public String getCurrentMonth() {
		return CurrentMonth;
	}


	public void setCurrentMonth(String currentMonth) {
		CurrentMonth = currentMonth;
	}


	public String execute()
	{
		Connection con = SingletonDB.getCon();
		
		try {
			ps = con.prepareStatement("select cdate from current where name = 'current'");
			rs = ps.executeQuery();
			if(rs.next())
			{
			String current = rs.getString("cdate");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate LocalCurrent = LocalDate.parse(current, formatter);
			String Month = LocalCurrent.getMonth().name();
			int Year = LocalCurrent.getYear();
			CurrentMonth = Month+" , "+ Year;
			}  
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	return "success";
	}
}

