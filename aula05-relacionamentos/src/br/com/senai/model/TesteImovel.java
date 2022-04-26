package br.com.senai.model;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("1233", "Rebeca", "rebeca@gmail ");
		Pessoa pessoa2 = new Pessoa("2123", "Roberta", "roberta@gmail ");
		Imovel imovel = new Imovel("apto ", 20000, pessoa);
		// Imovel imovel2 = new Imovel("Apto", 180500, new
		// Pessoa("232343","Ronaldo","maria@gmail.com"));

		System.out.println(
				"Imove" + imovel.getTipo() + "-" + "valor: " + imovel.getValor() + "dono" + imovel.getDono().getNome());
	}

}
