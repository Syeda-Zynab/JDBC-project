package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadOneRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjun25","root", "syeda110");
			
			PreparedStatement st=con.prepareStatement("select * from student where id= ?");
			st.setInt(1, 101);
			
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
			System.out.println(rs.getInt(1)+"-"+rs.getString(2)+"-"+rs.getString(3));
			}
			
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
