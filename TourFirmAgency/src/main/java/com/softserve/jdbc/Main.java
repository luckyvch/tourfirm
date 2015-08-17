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
		System.out.println();
//		controller.createNewClient();
//		controller.createNewClient();
		controller.showAllCities();
		
		try {
		String cityTosearch = "Paris";
		
		System.out.println();
		System.out.println("idCity of "+cityTosearch+" is "+controller.getCityIdByName(cityTosearch));
		
		int idCityToSearch = 9;
		System.out.println("Name of city with id "+idCityToSearch+" is "+controller.getCityNameById(idCityToSearch));
		System.out.println();
		
		controller.createNewCity();
		controller.showAllCities();
		} catch (SQLException e) {
			System.out.println("Error with dababase");
		}
		
		controller.CloseConnection();
	}

}
