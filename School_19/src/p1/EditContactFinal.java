package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EditContactFinal 
{
	private int admn;
	private String mob;
	PreparedStatement ps; 
	ResultSet rs;

	public String getMob() {
		return mob;
	}


	public void setMob(String mob) {
		this.mob = mob;
	}


	public int getAdmn() {
		return admn;
	}


	public void setAdmn(int admn) {
		this.admn = admn;
	}


	public String execute()
	{
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		
		try {
			System.out.println(admn);
			ps = con.prepareStatement("update students set mob=? where admn = ?");
			ps.setString(1, mob);
			ps.setInt(2, admn);
			ps.executeUpdate();
			}  
		
		catch(Exception e)
			{
			System.out.println(e);
		}
		
	return "success";
	}
}

