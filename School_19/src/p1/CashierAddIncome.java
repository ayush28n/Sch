package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class CashierAddIncome
{
	PreparedStatement ps,ps2;
	private List<String> IncomeType;




	public List<String> getIncomeType() {
		return IncomeType;
	}




	public void setIncomeType(List<String> incomeType) {
		IncomeType = incomeType;
	}




	public String execute() 
	{
		IncomeType = new ArrayList<>();
		try 
		{
			Connection con = SingletonDB.getCon();
			ps = con.prepareStatement("select name from incometype");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
			
				
				String c = rs.getString("name");
				IncomeType.add(c);
				
			}
			
			Collections.sort(IncomeType);
			System.out.println(IncomeType);
			return "success";
		}
			catch(Exception e)
			{
			System.out.println(e);
			return "error";
			}
		
	}
}
