package br.com.senai.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo4Excepitions {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		
		Scanner sc = new Scanner(System.in);
		try {

			fr = new FileReader("C: //temp//teste.txt");
			System.out.println("Arquivo existe! ");

		} catch (Exception e) {
			System.out.println("Arquivo não encontrado! ");
			//e.printStackTrace();
		} finally {
			System.out.println("Sempre entra aqui!");
		}

	}

}
