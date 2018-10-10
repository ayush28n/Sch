package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

public class FeeDueListTriggerPlaceWise 
{
	PreparedStatement ps,ps1,ps2,ps3,ps4;
	private ArrayList<Integer> YearList;
	private ArrayList<String> PlaceList;
	public String execute()
	{		
		try 
		{
			Connection con = SingletonDB.getCon();
			YearList =  new ArrayList<Integer>();
			PlaceList =  new ArrayList<String>();
			ps= con.prepareStatement("select * from current");
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				String cdate = rs.getString("cdate");
				LocalDate Current = LocalDate.parse(cdate);
				int CurrentYear = Current.getYear();
				for(int i = CurrentYear-1;i<=CurrentYear+2;i++)
					{
						YearList.add(i);
					}
			}
			ps1= con.prepareStatement("select name from places");
			ResultSet rs1 = ps1.executeQuery();
			while(rs1.next())
			{
				String cls = rs1.getString("name");
				PlaceList.add(cls);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return "success";
	}
	public ArrayList<Integer> getYearList() {
		return YearList;
	}
	public void setYearList(ArrayList<Integer> yearList) {
		YearList = yearList;
	}
	public ArrayList<String> getPlaceList() {
		return PlaceList;
	}
	public void setPlaceList(ArrayList<String> placeList) {
		PlaceList = placeList;
	}
		
}

