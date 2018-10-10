package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class SearchByContactLogic 
{
	private String mob;
	PreparedStatement ps,ps1,ps2;
	ArrayList<Student> list=new ArrayList<Student>();  
	ResultSet rs;
	
	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}

	

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String execute()
	{
	
		System.out.println("this is try block");
		Connection con = SingletonDB.getCon();
		System.out.println(mob);
		try {
			System.out.println(mob);
			ps = con.prepareStatement("select name,place,admn,fname,class,mob from students where mob = ?");
			ps.setString(1, mob);
			rs = ps.executeQuery();

		
	
		
				while(rs.next())
				{  
					Student stu=new Student();  
					stu.setName(rs.getString(1));  
					stu.setPlace(rs.getString(2));
					stu.setFname(rs.getString(4));
					stu.setCls(rs.getString(5));
					stu.setAdmn(rs.getInt(3));
					stu.setMob(rs.getString(6));
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


