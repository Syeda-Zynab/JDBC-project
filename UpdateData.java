package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjun25","root", "syeda110");
			
			PreparedStatement st = con.prepareStatement("update student set course= ? where id= ?");
			st.setString(1, "Hibernate");
			st.setInt(2, 102);
			
			int rowsUpdated=st.executeUpdate();
			System.out.println("no of rows updated: "+ rowsUpdated);
			
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
