package br.com.senai.persistence;

import java.sql.Connection;

public class testarConexao {
	static {
		System.out.println("Bloco");//entra junto com a criação da classe
	}
	
	public static void main(String[] args) {
		Connection connection = ConnectionactorySingleton.getConnection();
		System.out.println(connection);
	}

}