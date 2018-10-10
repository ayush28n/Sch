package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class placeentry 
{
	private String vill;
	PreparedStatement ps;

	

	public String getVill() {
		return vill;
	}



	public void setVill(String vill) {
		this.vill = vill;
	}



	public String execute()
	{
	try 
	{
		System.out.println(vill);
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("insert into places (name) values(?)");
		ps.setString(1,vill);
		ps.executeUpdate();
		System.out.println(vill);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return "success";
	}
}
