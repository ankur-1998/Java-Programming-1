package com.JDBC;

import java.sql.*;

public class JDBCExample2 {
	static final String driver = "com.mysql.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306";
	static final String pass1 = "root";
	static final String pass2 = "root";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		try{
			//Register JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(url,pass1,pass2);
			System.out.println("Connected database successfully...");
			
			//Execute a query
			System.out.println("Deleting database...");
			stmt = conn.createStatement();
			
			String sql = "drop database demo";
			stmt.executeUpdate(sql);
			System.out.println("Database deleted successfully...");
		}
		catch(SQLException se){
			//handle errors for JDBC
			se.printStackTrace();
		}
		catch(Exception e){
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
		}//end Try
		System.out.println("Goodbye!");
	}//end Main
	
}//end JDBCExample2
