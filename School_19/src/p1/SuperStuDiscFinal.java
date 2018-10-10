package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SuperStuDiscFinal 
{
	private int admn;
	private float transdisc,tutiondisc;
	private String cls,name;
	PreparedStatement ps; 
	ResultSet rs;

	public String getCls() {
		return cls;
	}


	public void setCls(String cls) {
		this.cls = cls;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAdmn() {
		return admn;
	}


	public void setAdmn(int admn) {
		this.admn = admn;
	}


	public float getTransdisc() {
		return transdisc;
	}


	public void setTransdisc(float transdisc) {
		this.transdisc = transdisc;
	}


	public float getTutiondisc() {
		return tutiondisc;
	}


	public void setTutiondisc(float tutiondisc) {
		this.tutiondisc = tutiondisc;
	}


	public String execute()
	{
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		
		try {
			System.out.println(admn);
			ps = con.prepareStatement("update students set tutiondisc=?,transdisc=? where admn = ?");
		
			ps.setFloat(1, tutiondisc);
			ps.setFloat(2, transdisc);
			ps.setInt(3, admn);
			ps.executeUpdate();
			}  
		
		catch(Exception e)
			{
			System.out.println(e);
		}
		
	return "success";
	}
}

