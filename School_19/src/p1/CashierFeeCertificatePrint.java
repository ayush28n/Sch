package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CashierFeeCertificatePrint 
{
	int admn;
	String fromdate,todate,name,fname;
	Float TotalFees=0.0f;
	PreparedStatement ps,ps1,ps2,ps3,ps4;
	ArrayList<CashierIncExp> FeeList=new ArrayList<CashierIncExp>();
	public String execute()
	{	
		try 
		{
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("select receiptno,name,date,total from receipt where date between ? and ? and admn = ?");
		ps1 = con.prepareStatement("select fname from students where admn = ?");
		ps.setString(1, fromdate);
		ps.setString(2, todate);
		ps.setInt(3, admn);
		ResultSet rs = ps.executeQuery();
		
		
		System.out.println("here");
		while(rs.next()){  
			   CashierIncExp ob=new CashierIncExp();  
			   ob.setReceiptno(rs.getInt(1));
			   ob.setDate(rs.getString(3));
			   ob.setTotal(rs.getFloat(4));
			   FeeList.add(ob);
			   TotalFees = TotalFees + rs.getFloat(4);
			   name = rs.getString(2);
		}
		System.out.println("hee");
		ps1.setInt(1, admn);
		System.out.println("hee");
		ResultSet rs1 = ps1.executeQuery();
		if(rs1.next())
		{
			fname = rs1.getString(1);
		}
		
		System.out.println("here22");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "success";
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
	public Float getTotalFees() {
		return TotalFees;
	}
	public void setTotalFees(Float totalFees) {
		TotalFees = totalFees;
	}
	public ArrayList<CashierIncExp> getFeeList() {
		return FeeList;
	}
	public void setFeeList(ArrayList<CashierIncExp> feeList) {
		FeeList = feeList;
	}
	public int getAdmn() {
		return admn;
	}
	public void setAdmn(int admn) {
		this.admn = admn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	

}

