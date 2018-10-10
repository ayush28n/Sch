package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class placedeleted 
{
	private String place;
	PreparedStatement ps;




	public String getPlace() {
		return place;
	}




	public void setPlace(String place) {
		this.place = place;
	}




	public String execute()
	{
	try 
	{
		System.out.println(place);
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("delete from places where name = ?");
		ps.setString(1,place);
		ps.executeUpdate();
		System.out.println(place);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return "success";
	}
}
