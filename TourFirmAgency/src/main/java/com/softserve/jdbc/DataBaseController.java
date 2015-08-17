package com.softserve.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;

/**
 * The Class DataBaseController.
 */
public class DataBaseController {

	/** The Constant URL. */
	private static final String URL = "jdbc:mysql://localhost/tourfirm";

	/** The Constant USER. */
	private static final String USER = "root";

	/** The Constant PASS. Generate your pass here */
	private static final String PASS = "root";

	/** The prepared statement. */
	private PreparedStatement ps;

	/** The connection interface. */
	private static Connection conn;

	/** The scanner. Input from the console if necessary */
	private Scanner scanner = new Scanner(System.in);

	/**
	 * Gets the connection to the database.
	 *
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 * @throws SQLException
	 *             the SQL exception
	 */
	public void GetConnection() throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Pidjednanna vukonano");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createNewClient() throws SQLException {
		System.out.println("First name: ");
		String fName = scanner.next();
		System.out.println("Second name: ");
		String sName = scanner.next();
		System.out.println("Passport info: ");
		String pasportInfo = scanner.next();
		System.out.println("Address: ");
		String adress = scanner.next();
		System.out.println("Tel. number: ");
		String tel = scanner.next();
		System.out.println("Email: ");
		String email = scanner.next();
		ps = conn.prepareStatement("insert into clientInfo"
				+ "(fName, sName, pasportNumber, adress, tel, email)"
				+ " values (?, ?, ?, ?, ?, ?)");
		ps.setString(1, fName);
		ps.setString(2, sName);
		ps.setString(3, pasportInfo);
		ps.setString(4, adress);
		ps.setString(5, tel);
		ps.setString(6, email);	
		ps.execute();
		ps.close();
	}
	
	
	/**
	 * Shows ids, names, countries of the available cities
	 * @throws SQLException
	 */
	public void showAllCities() throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from cities");
		System.out.println("All cities records that currently in database:");
		System.out.println("ID	Name			Country");
		while (rs.next()){
			System.out.println(rs.getString(1)+"	"+rs.getString(2)+"			"+rs.getString(3));
		}
		
	}
	
	/**
	 * Gets idCity by name
	 * @return city id, or 0 when not found
	 * @throws SQLException
	 */	
	public int getCityIdByName(String name) throws SQLException {
		ps = conn.prepareStatement("select idCity from cities where cityName like ?");
		ps.setString(1, name);
		ResultSet rs = ps.executeQuery();
		if (!rs.next()){
			return 0;
		}
		return rs.getInt(1);		
	}
	
	/**
	 * Gets city name by city id
	 * @return city name, or null when not found
	 * @throws SQLException
	 */	
	public String getCityNameById(int cityId) throws SQLException {
		ps = conn.prepareStatement("select cityName from cities where idCity=?");
		ps.setInt(1, cityId);
		ResultSet rs = ps.executeQuery();
		if (!rs.next()){
			return null;
		}
		return rs.getString(1);		
	}
	
	
	/**
	 * Insert city info into DB from user input
	 * @throws SQLException
	 */	
	public void createNewCity() throws SQLException {
		System.out.println("City name: ");
		String cityName = scanner.nextLine();
		System.out.println("Country: ");
		String country = scanner.nextLine();
		if (cityName == null || country == null) {
			System.out.println("Not all required data entered! Skipping DB insert...");
		} else {
			ps = conn.prepareStatement("insert into cities (cityName, country) values (?, ?)");
			ps.setString(1, cityName);
			ps.setString(2, country);
			ps.execute();
			ps.close();
		}
	}
	

	/**
	 * Close connection.
	 *
	 * @throws SQLException
	 *             the SQL exception
	 */
	public void CloseConnection() throws SQLException {
		conn.close();
		System.out.println("Pidjednanna zakryto");
	}

}
