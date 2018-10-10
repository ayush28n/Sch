package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CurrentSchoolStrength 
{
	PreparedStatement ps,ps2;
	String Count;
	public String execute()
	{
	
	Connection con = SingletonDB.getCon();
	try 
	{
		ps = con.prepareStatement("select count(admn) from students where class <> 'Passout'");
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			System.out.println("here");
			Count = rs.getString(1);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return "success";
	}
	
	public String getCount() {
		return Count;
	}
	public void setCount(String count) {
		Count = count;
	}
	
	
}

