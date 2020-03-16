package com.JDBC;

import java.sql.*;

public class JDBCExample4 {
	static final String driver = "com.mysql.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/demo";
	static final String pass1 = "root";
	static final String pass2 = "root";
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,pass1,pass2);
			stmt = conn.createStatement();
			
			String sql = "insert into student values(1,'Ankur','Ankit',22)";
			stmt.executeUpdate(sql);
			sql = "insert into student values(2,'Ira','Bisht',22)";
			stmt.executeUpdate(sql);
			sql = "insert into student values(3,'Akul','Sharma',24)";
			stmt.executeUpdate(sql);
			sql = "insert into student values(4,'Sakshi','Gautam',26)";
			stmt.executeUpdate(sql);
			sql = "insert into student values(5,'Swarnav','Das',21)";
			stmt.executeUpdate(sql);
			
			System.out.println("Insert values into the table successfully...");
			
			}
			catch(SQLException se)
		{
				//Handle errors for JDBC
				se.printStackTrace();
		}
		catch(Exception e)
		{
			//Handle errors for Class.forName
			e.printStackTrace();
		}
		finally
		{
			//finally block used to close resources
			try
			{
				if(stmt!=null)
					stmt.close();
			}
			catch(SQLException se2)
			{
				
			}//nothing we can do
			try
			{
				if(conn!=null)
					conn.close();
			}
			catch(SQLException se1)
			{
				se1.printStackTrace();
				
			}
			//end finally try
		}//end try
		System.out.println("Goodbye!");
	}//end main

}//end JDBCExample