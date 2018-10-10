package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SuperCashierWiseCollection 
{
	private ArrayList<String> usernames = new ArrayList<String>();
	PreparedStatement ps,ps2;
	
	public String execute()
	{	
		Connection con = SingletonDB.getCon();
		try
		{
		ps = con.prepareStatement("select username from cashier");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			usernames.add(rs.getString("username"));
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "success";
	}

	public ArrayList<String> getUsernames() {
		return usernames;
	}

	public void setUsernames(ArrayList<String> usernames) {
		this.usernames = usernames;
	}
	
}

