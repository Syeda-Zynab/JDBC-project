package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try {
			 //step1:load driver(mySQL driver)
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//s2:establishing connections
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjun25","root", "syeda110");  
		        //connection is interface and driver manager is class 
			
			//s3: prepare SQL statements
			Statement st=con.createStatement();//statement is interface
			
			//s4: execute query
			st.executeUpdate("create table student(id int, name varchar(50), course varchar(50)) "); 
			
			//s5: close connections
			st.close();
			con.close();
			System.out.println("table is created successfully!..check in db");
	
			
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


