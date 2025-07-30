package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) {
		try {
			//s1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//s2
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjun25","root", "syeda110"); 
			
			//s3
			PreparedStatement st=con.prepareStatement("insert into student values(?,?,?)");
			st.setInt(1, 101);
			st.setString(2, "john");
			st.setString(3, "devops");
			
			//s4
			int noOfRows=st.executeUpdate();
			System.out.println("number of rows inserted "+ noOfRows);
			
			//s5
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
