package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class deleteclass
{
	PreparedStatement ps,ps2;
	private List<String> classes;



	public List<String> getClasses() {
		return classes;
	}



	public void setClasses(List<String> classes) {
		this.classes = classes;
	}



	public String execute() 
	{
		classes = new ArrayList<>();
		try 
		{
			Connection con = SingletonDB.getCon();
			ps = con.prepareStatement("select class from tutionfee");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
			
				
				String c = rs.getString("class");
				classes.add(c);
				
			}
			
			Collections.sort(classes);
			System.out.println(classes);
			return "success";
		}
			catch(Exception e)
			{
			System.out.println(e);
			return "error";
			}
		
	}
}
