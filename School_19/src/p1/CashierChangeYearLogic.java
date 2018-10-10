package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;


public class CashierChangeYearLogic
{
	PreparedStatement ps,ps1,ps2,ps3,ps4;
	String NewAcademicYear;
	

public String getNewAcademicYear() {
		return NewAcademicYear;
	}


	public void setNewAcademicYear(String newAcademicYear) {
		NewAcademicYear = newAcademicYear;
	}


public String execute() 
{
	ResultSet rs1,rs2,rs3;
	float AnnFees=0;
	try 
	{
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("update current set yearf = ?, yeare = ? where name =?");	
		ps1 = con.prepareStatement("select * from current where name = ?");
	
		ps3 = con.prepareStatement("select * from otherfees where feename= 'Annual Fees'");
		ps4 = con.prepareStatement("update students set annfees = annfees + ? ");
		
		ps1.setString(1,"current");
		rs1 = ps1.executeQuery();
		rs3 = ps3.executeQuery();
		HttpSession sess = ServletActionContext.getRequest().getSession();

		
		
		
		if(rs3.next())
		{
			AnnFees = rs3.getInt("fees");
		}
		
		ps4.setFloat(1,AnnFees);
		
		
		System.out.println(AnnFees);
	
		ps4.executeUpdate();
		
		if(rs1.next())
		{
		int yearf =  rs1.getInt("yearf");
		int yeare =  rs1.getInt("yeare");
		
		int newyearf = yearf+1;
		int newyeare = yeare+1;
		
		NewAcademicYear = newyearf+" - "+newyeare;
		ps.setInt(1, newyearf);
		ps.setInt(2, newyeare);
		ps.setString(3,"current");
		ps.executeUpdate();
		}
		
		
		sess.setAttribute("AcademicYear", NewAcademicYear);
	}
	
		catch(Exception e)
		{
		System.out.println(e);
		return "wronguser";
		}
	return "success";
}
}
