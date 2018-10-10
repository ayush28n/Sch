package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.*;
import java.sql.ResultSet;
import java.time.format.DateTimeFormatter;
public class AdmitStu 
{
private String name, place, fname, dob, gender,cls,CollectAnnualFees,CollectAdmissionFees;
int admn,tutionmonth,transmonth;
float AnnualFees,AdmissionFees;
PreparedStatement ps,ps1,ps2,ps3;
long mobile;


public long getMobile() {
	return mobile;
}

public void setMobile(long mobile) {
	this.mobile = mobile;
}

public String getCollectAnnualFees() {
	return CollectAnnualFees;
}

public void setCollectAnnualFees(String collectAnnualFees) {
	CollectAnnualFees = collectAnnualFees;
}

public String getCollectAdmissionFees() {
	return CollectAdmissionFees;
}

public void setCollectAdmissionFees(String collectAdmissionFees) {
	CollectAdmissionFees = collectAdmissionFees;
}

public int getTutionmonth() {
	return tutionmonth;
}

public void setTutionmonth(int tutionmonth) {
	this.tutionmonth = tutionmonth;
}

public int getTransmonth() {
	return transmonth;
}

public void setTransmonth(int transmonth) {
	this.transmonth = transmonth;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
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

public String getCls() {
	return cls;
}

public void setCls(String cls) {
	this.cls = cls;
}

public int getAdmn() {
	return admn;
}

public void setAdmn(int admn) {
	this.admn = admn;
}

public String execute() 
{
	LocalDate ld= LocalDate.now();
	String dor = ld.toString();
	int year = ld.getYear();
	String transdue = year+"-"+transmonth+"-"+"01";
	String tutiondue = year+"-"+tutionmonth+"-01";
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate fdob = LocalDate.parse(dob, formatter);
	String ffdob = fdob.toString();
	System.out.println(fdob);
	try 
	{
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("insert into students (name,place,fname,dob,class,dor,gender,admn,duefrom,transduefrom,admfees,annfees,mob) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");	
		ps1 = con.prepareStatement("SELECT * FROM students ORDER BY admn DESC LIMIT 1");
		ps2 = con.prepareStatement("select * from otherfees where feename = ?");
		ps3 = con.prepareStatement("select * from otherfees where feename = ?");
		System.out.println(CollectAdmissionFees);
		
		if(CollectAdmissionFees.equals("yes"))
		{
			System.out.println("Entered in 1 Box");
			ps2.setString(1,"Admission Fees");
			ResultSet rs2 = ps2.executeQuery();
				
			if(rs2.next())
				{
				System.out.println("entered in 2 box");	
				AdmissionFees = rs2.getFloat("fees");
				}
		}
		
		System.out.println(CollectAnnualFees);
		System.out.println(AdmissionFees);
		
		
		if(CollectAnnualFees.equals("yes"))
		{
			ps3.setString(1,"Annual Fees");
			ResultSet rs3 = ps3.executeQuery();
			
				if(rs3.next())
				{
					AnnualFees = rs3.getFloat("fees");
				}
		}
		System.out.println(AnnualFees);
		
		
		ResultSet rs1 = ps1.executeQuery();
		if(rs1.next())
		{
			admn = rs1.getInt("admn")+1;
			System.out.println(admn);
		}
		ps.setString(1,name);
		ps.setString(2,place);
		ps.setString(3,fname);
		ps.setString(4,ffdob);
		ps.setString(5,cls);
		ps.setString(6,dor);
		ps.setString(7,gender);
		ps.setInt(8,admn);
		ps.setString(9,tutiondue);
		ps.setString(10,transdue);
		ps.setFloat(12,AnnualFees);
		ps.setFloat(11,AdmissionFees);
		ps.setLong(13, mobile);
		ps.executeUpdate();
		
	}
		catch(Exception e)
		{
		System.out.println(e);
		}
	System.out.println(name);
	System.out.println(cls);
	System.out.println(place);
	System.out.println(gender);
	System.out.println(dob);
	System.out.println(admn);
	return "success";
}


}
