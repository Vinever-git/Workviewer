package br.com.workViewer.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoJDBCFactory {
	public static Connection getConexao () throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		 return  DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/db_workviewer","root","");
		
	}

}
