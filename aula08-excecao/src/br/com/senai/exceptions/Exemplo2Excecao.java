package br.com.senai.exceptions;

public class Exemplo2Excecao {

	public static void main(String[] args) {
		String fraseInicial = null;
		String fraseFinal = null;

		try {
			fraseFinal = fraseInicial.toUpperCase();
			System.out.println("Resultado: " + fraseFinal);
		} catch (Exception e) {
			System.out.println("Falha ao converter !");
			e.printStackTrace();
		}

	}

}
