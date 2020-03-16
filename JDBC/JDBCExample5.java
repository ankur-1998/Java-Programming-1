package com.JDBC;

import java.sql.*;

public class JDBCExample5 {
	static final String driver = "com.mysql.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/demo";
	static final String pass1 = "root";
	static final String pass2 = "root";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,pass1,pass2);
			stmt = conn.createStatement();
			
			String sql = "select * from student";
			ResultSet rs = stmt.executeQuery(sql);
			
			//Extract data from ResultSet
			while(rs.next()){
				//retrieve by col name
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String first = rs.getString("firstName");
				String last = rs.getString("lastName");
				
				//display values
				System.out.println("ID: "+id);
				System.out.println("Age: "+age);
				System.out.println("First Name: "+first);
				System.out.println("Last Name: "+last);
				System.out.println();
			}
			rs.close();
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
