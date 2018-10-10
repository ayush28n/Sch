package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class SuperRemoveCashier
{
	PreparedStatement ps,ps2;
	private ArrayList<users> users = new ArrayList<users>();
	private ArrayList<String> usernames = new ArrayList<String>();

	

	public String execute() 
	{
		try 
		{
			System.out.println("here");
			Connection con = SingletonDB.getCon();
			ps = con.prepareStatement("select name,username from cashier where username<> 'admin'");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				users u = new users();
				
				u.setName(rs.getString("name"));
				u.setUsername(rs.getString("username"));
				users.add(u);
				usernames.add(rs.getString("username"));
			}
			return "success";
		}
			catch(Exception e)
			{
			System.out.println(e);
			return "error";
			}
		}
	public ArrayList<users> getUsers() {
		return users;
	}


	public void setUsers(ArrayList<users> users) {
		this.users = users;
	}
	public ArrayList<String> getUsernames() {
		return usernames;
	}
	public void setUsernames(ArrayList<String> usernames) {
		this.usernames = usernames;
	}
	
	

}
