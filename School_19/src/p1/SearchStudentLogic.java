package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class SearchStudentLogic 
{
	private String key,keytype;
	PreparedStatement ps,ps1,ps2;
	ArrayList<Student> list=new ArrayList<Student>();  
	ResultSet rs;
	
	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getKeytype() {
		return keytype;
	}

	public void setKeytype(String keytype) {
		this.keytype = keytype;
	}

	public String execute()
	{
	
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		System.out.println(keytype);
		try {
		if(keytype.equals("adm"))
		{
			System.out.println(keytype);
			ps = con.prepareStatement("select * from students where admn = ?");
			ps.setString(1, key);
			rs = ps.executeQuery();
		}
		
		else if(keytype.equals("name"))
		{
			System.out.println(keytype);
			String sqlname  = "%"+key+"%";
			ps = con.prepareStatement("select * from students where name like ?");
			ps.setString(1, sqlname);
			rs = ps.executeQuery();
		}
		else if(keytype.equals("fname"))
		{
			System.out.println(keytype);
			String sqlfname  = "%"+key+"%";
			ps = con.prepareStatement("select * from students where fname like ?");
			ps.setString(1, sqlfname);
			rs = ps.executeQuery();
		}
		else
		{
			System.out.println("kata");
		}
		
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

