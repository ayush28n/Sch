package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OtherFeeEntry 
{
	private String feename;
	int ofees;
	PreparedStatement ps,ps1;

	public String getFeename() {
		return feename;
	}

	public void setFeename(String feename) {
		this.feename = feename;
	}

	public int getOfees() {
		return ofees;
	}

	public void setOfees(int ofees) {
		this.ofees = ofees;
	}

	public String execute()
	{
	try 
	{
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("UPDATE otherfees SET fees = ? WHERE feename = ?;");
		ps.setInt(1,ofees);
		ps.setString(2,feename);
		ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return "success";
	}
}
