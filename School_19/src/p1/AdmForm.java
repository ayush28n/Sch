package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class AdmForm
{
	PreparedStatement ps,ps2;
	private List<String> classes;
	private List<String> places;
	private String defaultPlace;
	
	public List<String> getPlaces() {
		return places;
	}




	public void setPlaces(List<String> places) {
		this.places = places;
	}




	public List<String> getClasses() {
		return classes;
	}




	public void setClasses(List<String> classes) {
		this.classes = classes;
	}

	public String getDefaultClass() {
		return "1-A";
	}
	public String getDefaultPlace() {
		return "Self";}
	
	public void setDefaultPlace(String defaultPlace) {
		this.defaultPlace = defaultPlace;
	}



	public String execute() 
	{
		classes = new ArrayList<>();
		places=new ArrayList<>();
		defaultPlace = "Self";
		try 
		{
			Connection con = SingletonDB.getCon();
			ps = con.prepareStatement("select class from tutionfee");
			ps2 = con.prepareStatement("select name from places");
			ResultSet rs = ps.executeQuery();
			ResultSet rs2 = ps2.executeQuery();
			while(rs.next())
			{
				String c = rs.getString("class");
				classes.add(c);
			}	
			while(rs2.next())
			{
			String t = rs2.getString("name");
			places.add(t);
			}
			
			System.out.println(classes);
			System.out.println(places);
			return "success";
		}
			catch(Exception e)
			{
			System.out.println(e);
			return "error";
			}
		
	}
}
