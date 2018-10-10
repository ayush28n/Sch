package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CashierFeeCollectionPrint 
{
	String fromdate,todate;
	Float TotalFees=0.0f;
	PreparedStatement ps,ps1,ps2,ps3,ps4;
	ArrayList<CashierIncExp> FeeList=new ArrayList<CashierIncExp>();
	public String execute()
	{	
		try 
		{
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("select receiptno,admn,name,date,total,cashier,discount from receipt where date between ? and ?");
		ps.setString(1, fromdate);
		ps.setString(2, todate);
		ResultSet rs = ps.executeQuery();
		
		System.out.println("here");
		while(rs.next()){  
			   CashierIncExp ob=new CashierIncExp();  
			   ob.setReceiptno(rs.getInt(1));
			   ob.setAdmn(rs.getInt(2));
			   ob.setName(rs.getString(3));
			   ob.setDate(rs.getString(4));
			   ob.setTotal(rs.getFloat(5));
			   ob.setCashier(rs.getString(6));
			   ob.setDiscount(rs.getFloat(7));
			   FeeList.add(ob);
			   TotalFees = TotalFees + rs.getFloat(5);
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

}

