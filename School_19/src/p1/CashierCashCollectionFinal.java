package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class CashierCashCollectionFinal 
{
	String fromdate,todate;
	Float TotalFees=0.0f,TotalExpense=0.0f,TotalIncome=0.0f,TotalCash=0.0f;
	PreparedStatement ps,ps1,ps2,ps3,ps4;
	String cashier;
	int TotalStudents=0;
	public String execute()
	{	
		HttpSession sesscash = ServletActionContext.getRequest().getSession();
		cashier = (String) sesscash.getAttribute("CashierID");
		try 
		{
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("select total from receipt where date between ? and ? and cashier = ?");
		ps.setString(1, fromdate);
		ps.setString(2, todate);
		ps.setString(3, cashier);
		ResultSet rs = ps.executeQuery();
		
			while(rs.next())
			{  
			   TotalFees = TotalFees + rs.getFloat(1);
			   TotalStudents++;
			}
		
		ps1=con.prepareStatement("select amount from incomes where date between ? and ? and cashier = ? ");
		ps1.setString(1, fromdate);
		ps1.setString(2, todate);
		ps1.setString(3, cashier);
		ResultSet rs1 = ps1.executeQuery();
			while(rs1.next())
			{  
				TotalIncome = TotalIncome + rs1.getFloat(1);
			}
			
			
			ps2=con.prepareStatement("select amount from expenses where date between ? and ? and cashier = ? ");
			ps2.setString(1, fromdate);
			ps2.setString(2, todate);
			ps2.setString(3, cashier);
			ResultSet rs2 = ps2.executeQuery();
				while(rs2.next())
				{  
					TotalExpense = TotalExpense + rs2.getFloat(1);
				}
				
				TotalCash = TotalFees+TotalIncome-TotalExpense;
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
	public Float getTotalExpense() {
		return TotalExpense;
	}
	public void setTotalExpense(Float totalExpense) {
		TotalExpense = totalExpense;
	}
	public Float getTotalIncome() {
		return TotalIncome;
	}
	public void setTotalIncome(Float totalIncome) {
		TotalIncome = totalIncome;
	}
	public String getCashier() {
		return cashier;
	}
	public void setCashier(String cashier) {
		this.cashier = cashier;
	}
	public Float getTotalCash() {
		return TotalCash;
	}
	public void setTotalCash(Float totalCash) {
		TotalCash = totalCash;
	}
	public int getTotalStudents() {
		return TotalStudents;
	}
	public void setTotalStudents(int totalStudents) {
		TotalStudents = totalStudents;
	}
	
	

}

