package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class CashierCashDashboard 
{
	float TodayFees,TodayIncome,TodayExpense,MonthFees,MonthIncome,MonthExpense,TotalCash,TodayCash,MonthCash,TotalFees,TotalIncome,TotalExpense;
	float CashierTodayFees,CashierTodayCash,CashierTodayExpense,CashierTodayIncome;
	PreparedStatement ps,ps1,ps2,ps3,ps4,ps5,ps6,ps7;
	HttpSession sesscash = ServletActionContext.getRequest().getSession();
	
	public String execute()
	{		
		LocalDate ld = LocalDate.now();
		String ldstring = ld.toString();
		ResultSet rs,rs1,rs2;
		try 
		{
			String CashierID = (String) sesscash.getAttribute("CashierID");
			Connection con = SingletonDB.getCon();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			ps = con.prepareStatement("select total,date,cashier from receipt");
			rs = ps.executeQuery();
			System.out.println("here");
			while(rs.next())
			{
				System.out.println("here");
				String date = rs.getString("date");
				LocalDate FeesDate = LocalDate.parse(date, formatter);
				System.out.println("here22222");
				TotalFees  = TotalFees + rs.getFloat("total");
				
				System.out.println("here33333");
				if(rs.getString("date").equals(ldstring))
				{
					if(rs.getString("cashier").equals(CashierID))
					{
						CashierTodayFees = CashierTodayFees+rs.getFloat("total");
					}
					TodayFees = TodayFees + rs.getFloat("total");
				}
			
				if(FeesDate.getMonthValue()==ld.getMonthValue() && FeesDate.getYear()==ld.getYear())
				{
					MonthFees = MonthFees + rs.getFloat("total");
				}
			}
			System.out.println("here");
			ps1 = con.prepareStatement("select amount,date,cashier from expenses");
			rs1 = ps1.executeQuery();
			
			while(rs1.next())
			{
			
				System.out.println("here2");
				String expdate = rs1.getString("date");
				LocalDate ExpDate = LocalDate.parse(expdate, formatter);
				
				TotalExpense  = TotalExpense + rs1.getFloat("amount");
				
				if(rs1.getString("date").equals(ldstring))
				{
					TodayExpense = TodayExpense + rs1.getFloat("amount");
					if(rs1.getString("cashier").equals(CashierID))
					{
					CashierTodayExpense = CashierTodayExpense + rs1.getFloat("amount");
					}
				}
			
				if(ExpDate.getMonthValue()==ld.getMonthValue() && ExpDate.getYear()==ld.getYear())
				{
					MonthExpense = MonthExpense + rs1.getFloat("amount");
				}
			}
			
			System.out.println("here22");
			ps2 = con.prepareStatement("select amount,date,cashier from incomes");
			rs2 = ps2.executeQuery();
			
			while(rs2.next())
			{
				System.out.println("here3");
				String expdate = rs2.getString("date");
				LocalDate IncDate = LocalDate.parse(expdate, formatter);
				
				TotalIncome  = TotalIncome + rs2.getFloat("amount");
				
				if(rs2.getString("date").equals(ldstring))
				{
					TodayIncome = TodayIncome + rs2.getFloat("amount");
					if(rs2.getString("cashier").equals(CashierID))
					{
					CashierTodayIncome = CashierTodayIncome + rs2.getFloat("amount");
					}
				}
			
				if(IncDate.getMonthValue()==ld.getMonthValue() && IncDate.getYear()==ld.getYear())
				{
					MonthIncome = MonthIncome + rs2.getFloat("amount");
				}
			}
			
			TotalCash = TotalFees+TotalIncome-TotalExpense;
			TodayCash = TodayFees+TodayIncome-TodayExpense;
			MonthCash = MonthFees+MonthIncome-MonthExpense;
			CashierTodayCash = CashierTodayIncome+CashierTodayFees-CashierTodayExpense;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "success";
	}

	public float getTodayFees() {
		return TodayFees;
	}

	public void setTodayFees(float todayFees) {
		TodayFees = todayFees;
	}

	public float getTodayIncome() {
		return TodayIncome;
	}

	public void setTodayIncome(float todayIncome) {
		TodayIncome = todayIncome;
	}

	public float getTodayExpense() {
		return TodayExpense;
	}

	public void setTodayExpense(float todayExpense) {
		TodayExpense = todayExpense;
	}

	public float getMonthFees() {
		return MonthFees;
	}

	public void setMonthFees(float monthFees) {
		MonthFees = monthFees;
	}

	public float getMonthIncome() {
		return MonthIncome;
	}

	public void setMonthIncome(float monthIncome) {
		MonthIncome = monthIncome;
	}

	public float getMonthExpense() {
		return MonthExpense;
	}

	public void setMonthExpense(float monthExpense) {
		MonthExpense = monthExpense;
	}

	public float getTotalCash() {
		return TotalCash;
	}

	public void setTotalCash(float totalCash) {
		TotalCash = totalCash;
	}

	public float getTotalFees() {
		return TotalFees;
	}

	public void setTotalFees(float totalFees) {
		TotalFees = totalFees;
	}

	public float getTotalIncome() {
		return TotalIncome;
	}

	public void setTotalIncome(float totalIncome) {
		TotalIncome = totalIncome;
	}

	public float getTotalExpense() {
		return TotalExpense;
	}

	public void setTotalExpense(float totalExpense) {
		TotalExpense = totalExpense;
	}

	public float getTodayCash() {
		return TodayCash;
	}

	public void setTodayCash(float todayCash) {
		TodayCash = todayCash;
	}

	public float getMonthCash() {
		return MonthCash;
	}

	public void setMonthCash(float monthCash) {
		MonthCash = monthCash;
	}

	public float getCashierTodayFees() {
		return CashierTodayFees;
	}

	public void setCashierTodayFees(float cashierTodayFees) {
		CashierTodayFees = cashierTodayFees;
	}

	public float getCashierTodayCash() {
		return CashierTodayCash;
	}

	public void setCashierTodayCash(float cashierTodayCash) {
		CashierTodayCash = cashierTodayCash;
	}

	public float getCashierTodayExpense() {
		return CashierTodayExpense;
	}

	public void setCashierTodayExpense(float cashierTodayExpense) {
		CashierTodayExpense = cashierTodayExpense;
	}

	public float getCashierTodayIncome() {
		return CashierTodayIncome;
	}

	public void setCashierTodayIncome(float cashierTodayIncome) {
		CashierTodayIncome = cashierTodayIncome;
	}
	
	
	
}

