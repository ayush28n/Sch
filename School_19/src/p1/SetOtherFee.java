package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class SetOtherFee
{
	PreparedStatement ps,ps2;
	private List<String> feelist,feename;
	


	public List<String> getFeename() {
		return feename;
	}



	public void setFeename(List<String> feename) {
		this.feename = feename;
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
		feename = new ArrayList<>();
		try 
		{
			Connection con = SingletonDB.getCon();
			ps = con.prepareStatement("select * from otherfees");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
			
				
				String n = rs.getString("feename");
				feename.add(n);
				String f = rs.getString("fees");
				String nf =  n+" - "+f;
				feelist.add(nf);
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
