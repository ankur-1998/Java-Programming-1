package com.JDBC;

import java.sql.*;

public class JDBCExample3 {
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
			
			String sql = "create table student("
					+ "id int primary key,"
					+ "firstName varchar(10),"
					+ "lastName varchar(10),"
					+ "age int)";
			
			stmt.executeUpdate(sql);
			System.out.println("Created table in given database successfully...");
			
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