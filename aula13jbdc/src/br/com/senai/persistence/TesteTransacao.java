package br.com.senai.persistence;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.senai.model.Produto;

public class TesteTransacao {

	public static void main(String[] args) {
		Produto p1 = new Produto(null, "Manga", "Tommy", 9.0, 10);
		Produto p2 = new Produto(null, "Uva", "Verde", 8.0, 50);
		Produto p3 = new Produto(null, "Morango", "Mo", 7.0, 20);
		Connection connection = ConnectionactorySingleton.getConnection();
		try {

			connection.setAutoCommit(false);
			ProdutoDao dao = new ProdutoDao(connection);
			dao.inserir(p1);
			dao.inserir(p2);
			dao.inserir(p3);
			connection.commit();

		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

}
