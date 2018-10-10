package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class deleteplace
{
	PreparedStatement ps,ps2;
	private List<String> place;



	public List<String> getPlace() {
		return place;
	}




	public void setPlace(List<String> place) {
		this.place = place;
	}




	public String execute() 
	{
		place = new ArrayList<>();
		try 
		{
			Connection con = SingletonDB.getCon();
			ps = con.prepareStatement("select name from places");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
			
				
				String c = rs.getString("name");
				place.add(c);
				
			}
			
			System.out.println(place);
			return "success";
		}
			catch(Exception e)
			{
			System.out.println(e);
			return "error";
			}
		
	}
}
