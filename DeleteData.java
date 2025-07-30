package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {

	public static void main(String[] args) {
			   try {
				   Class.forName("com.mysql.cj.jdbc.Driver");
	
				   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjun25", "root", "syeda110");
				   
				   // Step 3: Prepare SQL delete statement
				   PreparedStatement st = con.prepareStatement("DELETE FROM student WHERE id = ?");
				   st.setInt(1, 103);  // delete student with id 103

				   // Step 4: Execute the statement
				   int rowsDeleted = st.executeUpdate();
				   System.out.println("Number of rows deleted: " + rowsDeleted);

				   st.close();
				   con.close();
				
			   } catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			   } catch (SQLException e) {
			
				e.printStackTrace();
			}		

	}

}
