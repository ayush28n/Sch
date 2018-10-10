package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class SuperNewUser
{
	PreparedStatement ps,ps2;
	private ArrayList<users> users = new ArrayList<users>();


	public ArrayList<users> getUsers() {
		return users;
	}


	public void setUsers(ArrayList<users> users) {
		this.users = users;
	}


	public String execute() 
	{
		try 
		{
			System.out.println("here");
			Connection con = SingletonDB.getCon();
			ps = con.prepareStatement("select name,username from user where username<>'admin'");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				users u = new users();
				
				u.setName(rs.getString("name"));
				u.setUsername(rs.getString("username"));
				users.add(u);
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
