package com.softserve.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class DataBaseController.
 */
public class DataBaseController {

	/** The Constant URL. */
	private static final String URL = "jdbc:mysql://localhost/tourfirm";

	/** The Constant USER. */
	private static final String USER = "root";

	/** The Constant PASS. Generate your pass here */
	private static final String PASS = "behindblueeyes";

	/**  The prepared statement. */
	private PreparedStatement ps;

	/**  The connection interface. */
	private static Connection conn;

	/** The scanner. Input from the console if necessary */
	private Scanner scanner = new Scanner(System.in);

	/**
	 * Gets the connection to the database.
	 *
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 */
	public void GetConnection() throws ClassNotFoundException,
			SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Pidjednanna vukonano");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// add your methods here
	
	
	
	
	/**
	 * Close connection.
	 *
	 * @throws SQLException the SQL exception
	 */
	public void CloseConnection() throws SQLException{
		conn.close();
		System.out.println("Pidjednanna zakryto");
	}

}
