package br.com.senai.arquivos;

import java.io.File;
import java.util.Scanner;

public class Exemplo3ListarArquivosPasta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o arquivo ou diretório "
				+ ""
				+ ""
				+ "");
		String nome = sc.next();
		File file = new File(nome);
		if(file.exists()) {
			if(file.isFile()) {
				System.out.printf("O arquivo (%s) existe- e o tamanho %d bytes"
						, file.getName(),file.length());//length retorna o tamanho do arquivo Name o nome do arquivo
			}else {
				System.out.println("Conteudo da pasta é:");
				//String[] diretorio = file.list();
				for (String item : file.list()) {
					System.out.println(item);
				}
			}
		}else {
			System.out.println("Arquivo ou diretorio não encontrado !");
		}
	}

}
