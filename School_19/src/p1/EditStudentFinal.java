package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EditStudentFinal 
{
	private int admn;
	private String mob,place,cls,name,dob,gender,fname;
	PreparedStatement ps; 
	ResultSet rs;

	
	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


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


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


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
			ps = con.prepareStatement("update students set name=?,place=?,fname=?,dob=?,class=?,gender=?,mob=? where admn = ?");
			System.out.println(admn);
			System.out.println(name);
			System.out.println(cls);
			System.out.println(fname);
			ps.setString(1, name);
			ps.setString(2, place);
			ps.setString(3, fname);
			ps.setString(4, dob);
			ps.setString(5, cls);
			ps.setString(6, gender);
			ps.setString(7, mob);
			ps.setInt(8, admn);
			ps.executeUpdate();
			}  
		
		catch(Exception e)
			{
			System.out.println(e);
		}
		
	return "success";
	}
}

