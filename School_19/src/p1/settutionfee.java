package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class settutionfee
{
	PreparedStatement ps,ps2;
	private List<String> feelist,classes;
	



	public List<String> getClasses() {
		return classes;
	}



	public void setClasses(List<String> classes) {
		this.classes = classes;
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
		classes = new ArrayList<>();
		try 
		{
			Connection con = SingletonDB.getCon();
			ps = con.prepareStatement("select * from tutionfee");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
			
				
				String c = rs.getString("class");
				classes.add(c);
				String f = rs.getString("fees");
				String cf =  c+" - "+f;
				feelist.add(cf);
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
