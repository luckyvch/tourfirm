package com.softserve.jdbc;

import java.sql.SQLException;

public class Main {

	/**
	 * The main method. To if class get and close connection to database
	 *
	 * @param args the arguments
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		DataBaseController controller = new DataBaseController();
		controller.GetConnection();
		controller.selectAllClients();	
		controller.CloseConnection();
	}

}
