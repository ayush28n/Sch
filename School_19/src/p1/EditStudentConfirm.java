package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class EditStudentConfirm 
{
	private int admn;
	PreparedStatement ps,ps1,ps2;
	ArrayList<Student> list=new ArrayList<Student>(); 
	private List<String> places,classes;
	ResultSet rs;
	
	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}

	public int getAdmn() {
		return admn;
	}

	public void setAdmn(int admn) {
		this.admn = admn;
	}

	
	
	public List<String> getPlaces() {
		return places;
	}

	public void setPlaces(List<String> places) {
		this.places = places;
	}
	
	

	public List<String> getClasses() {
		return classes;
	}

	public void setClasses(List<String> classes) {
		this.classes = classes;
	}

	public String execute()
	{
		places = new ArrayList<>();
		classes = new ArrayList<>();
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		try {
			ps = con.prepareStatement("select name,mob,admn,place,fname,class,gender,dob from students where admn = ?");
			ps.setInt(1, admn);
			rs = ps.executeQuery();
			ps1= con.prepareStatement("select name from places");
			ps2= con.prepareStatement("select class from tutionfee");
			while(rs.next()){  
			   Student stu=new Student();  
			   stu.setName(rs.getString(1));  
			   stu.setMob(rs.getString(2));
			   stu.setAdmn(rs.getInt(3));
			   stu.setPlace(rs.getString(4));
			   stu.setFname(rs.getString(5));
			   stu.setCls(rs.getString(6));
			   stu.setGender(rs.getString(7));
			   stu.setDob(rs.getString(8));
			   list.add(stu);  
			}
			
			ResultSet rs2 = ps1.executeQuery();
			ResultSet rs3 = ps2.executeQuery();
			while(rs2.next())
			{
				String p = rs2.getString("name");
				places.add(p);
			}
			
			while(rs3.next())
			{
				String c = rs3.getString("class");
				classes.add(c);
			}

		}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	return "success";
	}
}

