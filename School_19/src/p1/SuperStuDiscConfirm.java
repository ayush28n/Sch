package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class SuperStuDiscConfirm 
{
	private int admn;
	PreparedStatement ps,ps1,ps2;
	ArrayList<Student> list=new ArrayList<Student>();  
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

	public String execute()
	{
	
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		try {
			ps = con.prepareStatement("select name,class,admn,tutiondisc,transdisc from students where admn = ?");
			ps.setInt(1, admn);
			rs = ps.executeQuery();
		
			while(rs.next()){  
			   Student stu=new Student();  
			   stu.setName(rs.getString(1));  
			   stu.setCls(rs.getString(2));
			   stu.setAdmn(rs.getInt(3));
			   stu.setTutiondisc(rs.getFloat(4));
			   stu.setTransdisc(rs.getFloat(5));
			   list.add(stu);  
	 }  
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	return "success";
	}
}

