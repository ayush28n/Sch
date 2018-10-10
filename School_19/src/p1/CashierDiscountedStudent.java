package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class CashierDiscountedStudent 
{
	
	PreparedStatement ps,ps1,ps2;
	ArrayList<Student> list=new ArrayList<Student>();  
	ResultSet rs;
	
	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}
	

	public String execute()
	{
	
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		
		try {
		
			
			ps = con.prepareStatement("select admn,name,place,class,transdisc,tutiondisc from students where transdisc>0 or tutiondisc>0");
			rs = ps.executeQuery();

		
		while(rs.next()){  
			   Student stu=new Student();  
			   stu.setName(rs.getString(2));  
			   stu.setPlace(rs.getString(3));
			   stu.setCls(rs.getString(4));
			   stu.setAdmn(rs.getInt(1));
			   stu.setTransdisc(rs.getFloat(5));
			   stu.setTutiondisc(rs.getFloat(6));
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

