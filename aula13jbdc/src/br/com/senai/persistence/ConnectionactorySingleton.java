package br.com.senai.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionactorySingleton {
	private static String urlConexao = "jdbc:postgresql://localhost:5432/testebd";
	private static String usuario = "postgres";
	private static String senha = "Fritzz4266@";
	private static Connection connection;
	
	//Padr�o Singleton - tenho uma �nica conex�o
	public static Connection newConnection() {
		try {
			connection = DriverManager.getConnection(urlConexao, usuario, senha);
			System.out.println("Conectado");
		} catch (SQLException e) {
			System.out.println("N�o foi poss�vel conectar !");
		}
		return connection;
	}

	public static Connection getConnection() {
		if (connection == null) {
			connection = newConnection();
		}
		return connection;
	}
}
