package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class GetClassList 
{
	private String cls;
	PreparedStatement ps,ps1,ps2;
	ArrayList<Student> list=new ArrayList<Student>();  
	ResultSet rs;
	
	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}
	

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public String execute()
	{
	
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		System.out.println(cls);
		try {
		
			System.out.println(cls);
			ps = con.prepareStatement("select * from students where class = ?");
			ps.setString(1, cls);
			rs = ps.executeQuery();

		
		while(rs.next()){  
			   Student stu=new Student();  
			   stu.setName(rs.getString(1));  
			   stu.setPlace(rs.getString(2));
			   stu.setFname(rs.getString(3));
			   stu.setDob(rs.getString(4));
			   stu.setCls(rs.getString(5));
			   stu.setAdmn(rs.getInt(6));
			   stu.setDor(rs.getString(7));
			   stu.setGender(rs.getString(8));
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

