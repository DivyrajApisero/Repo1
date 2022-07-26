package data.jdbc;

import java.sql.*;

public class database
{
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/lVPZfouWyN","lVPZfouWyN","8xLuMzDlX2");
		    System.out.println("connected");
		    Statement st=con.createStatement();
		    ResultSet rs=st.executeQuery("select * from Employee");
		    while(rs.next())
		    {
		    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		    }
		    rs.close();
		    st.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
-