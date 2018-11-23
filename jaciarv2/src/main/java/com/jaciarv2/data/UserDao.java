package com.jaciarv2.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jaciarv2.entities.User;

public class UserDao { 
	public List<User> getAllUsers(){ 

		List<User> userList = null; 
		Connection connection = null;

		try {
			//Registro de oracle driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "ubicuo", "ubicuo2017");
			Statement stmt = null;

			String query = "select ID, NOMBRE, DESCRIPCION" +
					" from ESTADO";

			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			userList = new ArrayList<User>();
			
			while (rs.next()) {
				int ID = rs.getInt("ID");
				String name = rs.getString("NOMBRE");
				String profession = rs.getString("DESCRIPCION");

				userList.add(new User(ID, name, profession));
			}

			return userList;

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		return userList;
	}    

	public List<User> getTestUsers(){
		List<User> userList = new ArrayList<User>();

		User u1 = new User(1, "Jose Montalvo", "Gestor"); 
		User u2 = new User(1, "Juan Cho Tazo", "Vago"); 
		User u3 = new User(1, "Jose Cito", "No hace nada"); 

		userList.add(u1);
		userList.add(u2);
		userList.add(u3);

		return userList;
	}
}