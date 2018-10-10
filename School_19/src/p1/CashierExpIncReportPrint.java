package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CashierExpIncReportPrint 
{
	String fromdate,todate;
	Float TotalIncome=0.0f,debtinc=0.0f,other1inc=0.0f,other2inc=0.0f;
	Float TotalExpense=0.0f,buildingexp=0.0f,stationaryexp=0.0f,fuelexp=0.0f,furnitureexp=0.0f,other1exp=0.0f,other2exp=0.0f,ppexp=0.0f,salexp=0.0f,transexp=0.0f;
	PreparedStatement ps,ps1,ps2,ps3,ps4;
	ArrayList<CashierIncExp> ExpenseList=new ArrayList<CashierIncExp>();
	ArrayList<CashierIncExp> IncomeList=new ArrayList<CashierIncExp>();
	public String execute()
	{	
		try 
		{
		Connection con = SingletonDB.getCon();
		ps = con.prepareStatement("select * from expenses where date between ? and ?");
		ps1 = con.prepareStatement("select * from incomes where date between ? and ?");
		ps.setString(1, fromdate);
		ps.setString(2, todate);
		ps1.setString(1, fromdate);
		ps1.setString(2, todate);
		ResultSet rs = ps.executeQuery();
		
		System.out.println("here");
		while(rs.next()){  
			   CashierIncExp ob=new CashierIncExp();  
			   ob.setType(rs.getString(1));
			   ob.setDate(rs.getString(2));
			   ob.setTime(rs.getString(3));
			   ob.setAmount(rs.getFloat(4));
			   ob.setDesc(rs.getString(5));
			   ob.setCashier(rs.getString(6));
			   ExpenseList.add(ob);
			   TotalExpense = TotalExpense + rs.getFloat(4);
			   if(rs.getString(1).equals("building"))
			   {
				   buildingexp = buildingexp + rs.getFloat(4);
			   }
			   
			   if(rs.getString(1).equals("fuel"))
			   {
				   fuelexp = fuelexp + rs.getFloat(4);
			   }
			   if(rs.getString(1).equals("furniture"))
			   {
				   furnitureexp = furnitureexp + rs.getFloat(4);
			   }
			   if(rs.getString(1).equals("other1"))
			   {
				   other1exp = other1exp + rs.getFloat(4);
			   }
			   if(rs.getString(1).equals("other2"))
			   {
				   other2exp = other2exp + rs.getFloat(4);
			   }
			   if(rs.getString(1).equals("pp"))
			   {
				   ppexp = ppexp + rs.getFloat(4);
			   }
			   if(rs.getString(1).equals("salary"))
			   {
				   salexp = salexp + rs.getFloat(4);
			   }
			   if(rs.getString(1).equals("stationary"))
			   {
				   stationaryexp = stationaryexp + rs.getFloat(4);
			   }
			   if(rs.getString(1).equals("transport maintenance"))
			   {
				   transexp = transexp + rs.getFloat(4);
			   }
			  }
		System.out.println("here");
		
		ResultSet rs1 = ps1.executeQuery();
		while(rs1.next()){  
			   CashierIncExp ob=new CashierIncExp();  
			   ob.setType(rs1.getString(1));  
			   ob.setDate(rs1.getString(2));
			   ob.setTime(rs1.getString(3));
			   ob.setAmount(rs1.getFloat(4));
			   ob.setDesc(rs1.getString(5));
			   ob.setCashier(rs1.getString(6));
			   IncomeList.add(ob);
			   TotalIncome = TotalIncome + rs1.getFloat(4);
			   if(rs1.getString(1).equals("debt recovery"))
			   {
				   debtinc = debtinc + rs1.getFloat(4);
			   }
			  
			   if(rs1.getString(1).equals("other 1"))
			   {
				   other1inc = other1inc + rs1.getFloat(4);
			   }
			   
			   if(rs1.getString(1).equals("other 2"))
			   {
				   other2inc = other2inc + rs1.getFloat(4);
			   }
			  }
		System.out.println("here");
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
	public ArrayList<CashierIncExp> getExpenseList() {
		return ExpenseList;
	}
	public void setExpenseList(ArrayList<CashierIncExp> expenseList) {
		ExpenseList = expenseList;
	}
	public ArrayList<CashierIncExp> getIncomeList() {
		return IncomeList;
	}
	public void setIncomeList(ArrayList<CashierIncExp> incomeList) {
		IncomeList = incomeList;
	}
	public Float getTotalIncome() {
		return TotalIncome;
	}
	public void setTotalIncome(Float totalIncome) {
		TotalIncome = totalIncome;
	}
	public Float getTotalExpense() {
		return TotalExpense;
	}
	public void setTotalExpense(Float totalExpense) {
		TotalExpense = totalExpense;
	}
	public Float getDebtinc() {
		return debtinc;
	}
	public void setDebtinc(Float debtinc) {
		this.debtinc = debtinc;
	}
	public Float getOther1inc() {
		return other1inc;
	}
	public void setOther1inc(Float other1inc) {
		this.other1inc = other1inc;
	}
	public Float getOther2inc() {
		return other2inc;
	}
	public void setOther2inc(Float other2inc) {
		this.other2inc = other2inc;
	}
	public Float getBuildingexp() {
		return buildingexp;
	}
	public void setBuildingexp(Float buildingexp) {
		this.buildingexp = buildingexp;
	}
	public Float getStationaryexp() {
		return stationaryexp;
	}
	public void setStationaryexp(Float stationaryexp) {
		this.stationaryexp = stationaryexp;
	}
	public Float getFuelexp() {
		return fuelexp;
	}
	public void setFuelexp(Float fuelexp) {
		this.fuelexp = fuelexp;
	}
	public Float getFurnitureexp() {
		return furnitureexp;
	}
	public void setFurnitureexp(Float furnitureexp) {
		this.furnitureexp = furnitureexp;
	}
	public Float getOther1exp() {
		return other1exp;
	}
	public void setOther1exp(Float other1exp) {
		this.other1exp = other1exp;
	}
	public Float getOther2exp() {
		return other2exp;
	}
	public void setOther2exp(Float other2exp) {
		this.other2exp = other2exp;
	}
	public Float getPpexp() {
		return ppexp;
	}
	public void setPpexp(Float ppexp) {
		this.ppexp = ppexp;
	}
	public Float getSalexp() {
		return salexp;
	}
	public void setSalexp(Float salexp) {
		this.salexp = salexp;
	}
	public Float getTransexp() {
		return transexp;
	}
	public void setTransexp(Float transexp) {
		this.transexp = transexp;
	}
	
}

