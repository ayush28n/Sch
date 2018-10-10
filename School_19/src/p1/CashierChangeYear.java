package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class CashierChangeYear 
{
	
	PreparedStatement ps,ps1,ps2;
	ResultSet rs;
	String CurrentAcademicYear;
	
	public String getCurrentAcademicYear() {
		return CurrentAcademicYear;
	}

	public void setCurrentAcademicYear(String currentAcademicYear) {
		CurrentAcademicYear = currentAcademicYear;
	}

	public String execute()
	{
		Connection con = SingletonDB.getCon();
		
		try {
			ps = con.prepareStatement("select * from current where name = 'current'");
			rs = ps.executeQuery();
			if(rs.next())
			{
			String yearf = rs.getString("yearf");
			String yeare = rs.getString("yeare");
			CurrentAcademicYear = yearf+" - "+yeare;
			}  
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	return "success";
	}
}

