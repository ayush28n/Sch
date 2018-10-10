package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SuperNewUserAdded 
{
	private String name,username,pass;
	PreparedStatement ps,ps1;

	public String execute()
	{
	try 
	{
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("insert into user (name,username,password,role) values(?,?,?,'normal')");
		ps.setString(1,name);
		ps.setString(2,username);
		ps.setString(3,pass);
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
