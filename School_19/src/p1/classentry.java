package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class classentry 
{
	private String cls,sec,fcls;
	PreparedStatement ps,ps1;

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public String getSec() {
		return sec;
	}

	public void setSec(String sec) {
		this.sec = sec;
	}
	

	public String getFcls() {
		return fcls;
	}

	public void setFcls(String fcls) {
		this.fcls = fcls;
	}

	public String execute()
	{
	try 
	{
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		fcls = cls+"-"+sec;
		ps = con.prepareStatement("insert into tutionfee (class) values(?)");
		ps.setString(1,fcls);
		ps.executeUpdate();
		System.out.println(fcls);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return "success";
	}
}
