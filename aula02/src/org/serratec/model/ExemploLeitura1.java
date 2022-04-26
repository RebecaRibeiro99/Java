package org.serratec.model;

public class ExemploLeitura1 {

	public static void main(String[] args) {
		String nome = "Maria";
		String sobrenome= " Joaquina";
		int idade = 40;
		double altura = 1.85;
		double peso = 76.5;

		System.out.printf("%s tem %d anos e altura de %.2f", nome, idade, altura);
        System.out.printf("%s %s", nome, sobrenome);
		System.out.printf("\n%s - %f",nome, peso);
		/*%s - para formatar String
		 * %d - para formatar inteiros
		 * %f - para formatar double, float e outros
		 * 
		 */
	}

}
