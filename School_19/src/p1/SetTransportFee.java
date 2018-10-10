package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class SetTransportFee
{
	PreparedStatement ps,ps2;
	private List<String> feelist,places;
	

	public List<String> getPlaces() {
		return places;
	}



	public void setPlaces(List<String> places) {
		this.places = places;
	}



	public List<String> getFeelist() {
		return feelist;
	}



	public void setFeelist(List<String> feelist) {
		this.feelist = feelist;
	}




	public String execute() 
	{
		feelist = new ArrayList<>();
		places = new ArrayList<>();
		try 
		{
			Connection con = SingletonDB.getCon();
			ps = con.prepareStatement("select * from places");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
			
				
				String p = rs.getString("name");
				places.add(p);
				String f = rs.getString("fees");
				String pf =  p+" - "+f;
				feelist.add(pf);
			}
			return "success";
		}
			catch(Exception e)
			{
			System.out.println(e);
			return "error";
			}
		
	}
}
