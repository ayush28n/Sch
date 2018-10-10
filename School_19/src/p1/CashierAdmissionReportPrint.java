package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class CashierAdmissionReportPrint 
{
	
	PreparedStatement ps,ps1,ps2;
	ArrayList<Student> list=new ArrayList<Student>();  
	ResultSet rs;
	String fromdate,todate;
	
	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}
	
	

	public String getFromdate() {
		return fromdate;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	public String getTodate() {
		return todate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}

	public String execute()
	{
	
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		
		try {
		
			
			ps = con.prepareStatement("select * from students where (dor between ? AND ?)");
			ps.setString(1, fromdate);
			ps.setString(2, todate);
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

