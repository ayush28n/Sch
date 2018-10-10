package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TransportFeeEntry 
{
	private String place;
	int trfees;
	PreparedStatement ps,ps1;

	
	
	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	
	public int getTrfees() {
		return trfees;
	}

	public void setTrfees(int trfees) {
		this.trfees = trfees;
	}

	public String execute()
	{
	try 
	{
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("UPDATE places SET fees = ? WHERE name = ?;");
		ps.setInt(1,trfees);
		ps.setString(2,place);
		ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return "success";
	}
}
