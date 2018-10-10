package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class CashierSearchReceiptResult 
{
	
	PreparedStatement ps,ps1,ps2;
	ArrayList<Student> list=new ArrayList<Student>();  
	ResultSet rs;
	float totaltotal=0f;
	int admn;
	
	
	public int getAdmn() {
		return admn;
	}

	public void setAdmn(int admn) {
		this.admn = admn;
	}

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}
	
	
	

	public float getTotaltotal() {
		return totaltotal;
	}

	public void setTotaltotal(float totaltotal) {
		this.totaltotal = totaltotal;
	}

	public String execute()
	{
	
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		
		try {
		
			
			ps = con.prepareStatement("select receiptno,name,date,total from receipt where admn = ?");
			ps.setInt(1, admn);
			rs = ps.executeQuery();

		
		while(rs.next()){  
			   Student stu=new Student();  
			   stu.setReceiptno(rs.getInt(1));
			   stu.setName(rs.getString(2));  
			   stu.setDate(rs.getString(3));
			   stu.setTotal(rs.getFloat(4));
			   list.add(stu);  
			   totaltotal = totaltotal + rs.getFloat(4);	
			   }  
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	return "success";
	}
}

