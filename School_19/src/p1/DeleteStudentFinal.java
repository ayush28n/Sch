package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DeleteStudentFinal 
{
	private int admn;
	PreparedStatement ps; 
	ResultSet rs;
	
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
			ps = con.prepareStatement("delete from students where admn = ?");
			ps.setInt(1, admn);
			ps.executeUpdate();
			}  
		
		catch(Exception e)
			{
			System.out.println(e);
		}
		
	return "success";
	}
}

