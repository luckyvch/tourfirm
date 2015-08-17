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
		if (cityName.length() == 0 || country.length() == 0) {
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
	 * Insert room for selected hotel into DB from user input
	 * @throws SQLException
	 */	
	public void createNewRoom() throws SQLException {
		showAllHotels();
		System.out.println("Enter id of the hotel:");
		int idHotel = scanner.nextInt();
		ps=conn.prepareStatement("select hotelName from hotels where idHotel=?");
		ps.setInt(1, idHotel);
		ResultSet rs2 = ps.executeQuery();
		rs2.next();
		String selectedHotel = rs2.getString(1);
		System.out.println("You have selected "+selectedHotel);
		System.out.println("Enter room number:");
		int roomNumber = scanner.nextInt();
		System.out.println("Enter room capacity (number of beds):");
		int beds = scanner.nextInt();
		System.out.println("Enter room price per night (US dollars)");
		int price = scanner.nextInt();

			ps = conn.prepareStatement("insert into rooms (idHotel, roomNumber, beds, price) VALUES (?, ?, ?, ?)");
			ps.setInt(1, idHotel);
			ps.setInt(2, roomNumber);
			ps.setInt(3, beds);
			ps.setInt(4, price);
			ps.execute();
			ps.close();

	}
	
	/**
	 * Shows all hotels in DB
	 * @throws SQLException
	 */
	public void showAllHotels() throws SQLException{
		System.out.println();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select idHotel, hotelName from hotels");
		while (rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
	}
	
	
	/**
	 * Shows all rooms in particular hotel
	 * @param idHotel - id of hotel with desired rooms
	 * @throws SQLException
	 */
	public void showAllRoomsInHotel (int idHotel) throws SQLException {
		ps=conn.prepareStatement("select roomNumber, beds, price from rooms where idHotel=?");
		ps.setInt(1, idHotel);
		System.out.println();
		ResultSet rs = ps.executeQuery();
		System.out.println("roomNumber     beds     price");
		System.out.println("-----------------------------");
		while (rs.next()){
			System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3));
		}
		
	}
	
	/**
	 * Updates room info
	 * @throws SQLException
	 */
	public void updateRoomInfo() throws SQLException {
		System.out.println("Available hotels:");
		showAllHotels();
		System.out.println("Select hotel:");
		int idHotel = scanner.nextInt();
		ps=conn.prepareStatement("select hotelName from hotels where idHotel=?");
		ps.setInt(1, idHotel);
		ResultSet rs = ps.executeQuery();
		rs.next();
		String selectedHotel = rs.getString(1);
		System.out.println("You have selected "+selectedHotel);
		System.out.println("Rooms in this hotel:");
		showAllRoomsInHotel(idHotel);
		System.out.println();
		
		System.out.println("Select room:");
		int roomNumber = scanner.nextInt();
		
		ps=conn.prepareStatement("select beds, price from rooms where roomNumber=? and idHotel=?");
		ps.setInt(1, roomNumber);
		ps.setInt(2, idHotel);
		rs = ps.executeQuery();
		rs.next();
		int currentBeds = rs.getInt(1);
		int currentPrice = rs.getInt(2);
		
		System.out.println("New beds number:(current "+currentBeds+")");
		int newBeds = scanner.nextInt();
		System.out.println("New price: (current "+currentPrice+")");
		int newPrice = scanner.nextInt();
		
		ps = conn.prepareStatement("update rooms set beds=?, price=? where roomNumber=?");
		ps.setInt(1, newBeds);
		ps.setInt(2, newPrice);
		ps.setInt(3, roomNumber);
		ps.execute();
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
