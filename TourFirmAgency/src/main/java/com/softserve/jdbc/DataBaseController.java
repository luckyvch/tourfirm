package com.softserve.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

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
		System.out.println("¬вед≥ть ≥м'€: ");
		String fName = scanner.next();
		System.out.println("¬вед≥ть пр≥звище: ");
		String sName = scanner.next();
		System.out.println("¬вед≥ть сер≥ю та номер паспорта: ");
		String pasportInfo = scanner.next();
		System.out.println("¬вед≥ть адресу: ");
		String adress = scanner.next();
		System.out.println("¬вед≥ть телефон: ");
		String tel = scanner.next();
		System.out.println("¬вед≥ть email: ");
		String email = scanner.next();
		ps = conn.prepareStatement("insert into clientinfo"
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
