package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class CashierAddExpenses
{
	PreparedStatement ps,ps2;
	private List<String> ExpenseType;



	public List<String> getExpenseType() {
		return ExpenseType;
	}



	public void setExpenseType(List<String> expenseType) {
		ExpenseType = expenseType;
	}



	public String execute() 
	{
		ExpenseType = new ArrayList<>();
		try 
		{
			Connection con = SingletonDB.getCon();
			ps = con.prepareStatement("select name from expensetype");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
			
				
				String c = rs.getString("name");
				ExpenseType.add(c);
				
			}
			
			Collections.sort(ExpenseType);
			System.out.println(ExpenseType);
			return "success";
		}
			catch(Exception e)
			{
			System.out.println(e);
			return "error";
			}
		
	}
}
