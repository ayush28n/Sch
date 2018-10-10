package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class tutionfeeentry 
{
	private String cls;
	int tfees;
	PreparedStatement ps,ps1;

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	
	public int getTfees() {
		return tfees;
	}

	public void setTfees(int tfees) {
		this.tfees = tfees;
	}

	public String execute()
	{
	try 
	{
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("UPDATE tutionfee SET fees = ? WHERE class = ?;");
		ps.setInt(1,tfees);
		ps.setString(2,cls);
		ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return "success";
	}
}
