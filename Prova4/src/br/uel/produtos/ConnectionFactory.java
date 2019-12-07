package br.uel.produtos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(
					"jdbc:mysql://35.223.2.93:3306/"
					+ "produtos?useTimezone=true&serverTimezone=America/"
					+ "Sao_Paulo", 
					"aluno", "aluno");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

}
