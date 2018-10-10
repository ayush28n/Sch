package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class classdeleted 
{
	private String cls;
	PreparedStatement ps,ps1;

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}
	
	public String execute()
	{
	try 
	{
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("delete from tutionfee where class = ?");
		ps.setString(1,cls);
		ps.executeUpdate();
		System.out.println(cls);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return "success";
	}
}
