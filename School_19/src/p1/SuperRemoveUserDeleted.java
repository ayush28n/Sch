package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SuperRemoveUserDeleted 
{
	private String name,username,pass;
	PreparedStatement ps,ps1;

	public String execute()
	{
	try 
	{
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("delete from user where username = ?");
		ps.setString(1,username);
		ps.executeUpdate();
	}
	catch(Exception e)
	{
		
		System.out.println(e);
		return "error";
	}
	return "success";
	
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
