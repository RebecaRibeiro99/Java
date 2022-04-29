package br.com.senai.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exemplo1Arquivo {

	public static void main(String[] args) {
		File arquivo = new File("teste2\\exercicio.txt");
		try {
			Scanner sc = new Scanner(arquivo);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado !");
			e.printStackTrace();
		}

	}

}
