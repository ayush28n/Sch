package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class createplace
{
	PreparedStatement ps,ps2;
	private List<String> village;

	public List<String> getVillage() {
		return village;
	}

	public void setVillage(List<String> village) {
		this.village = village;
	}


	public String execute() 
	{
		village = new ArrayList<>();
		try 
		{
			Connection con = SingletonDB.getCon();
			ps = con.prepareStatement("select name from places");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
			
				
				String c = rs.getString("name");
				village.add(c);
				
			}
			
			Collections.sort(village);
			System.out.println(village);
			return "success";
		}
			catch(Exception e)
			{
			System.out.println(e);
			return "error";
			}
		
	}
}
