package p1;

import java.sql.*;

public class SingletonDB 
{
	static Connection con = null;
	public static Connection getCon()
		{
			if (con==null)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dps?useSSL=false","root","ayush");
					return con;
					}
					catch(Exception e)
					{
					System.out.println(e);
					return con;
					}	
			}
			else
			{
				return con;
			}
			
		}
}
