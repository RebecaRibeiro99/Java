package br.com.senai.model;

public class TestePessoa {

	public static void main(String[] args) {

		Estado estado = new Estado("Rio de Janeiro", "RJ");
		Cidade cidade = new Cidade("Petrópolis", estado);
		Endereco endereco = new Endereco("Rua Nelson Sa Earp", "Centro", "25680386", cidade);
		Contato contato = new Contato("Vinicius", endereco, new Telefone[2]);
		Telefone telefones = new Telefone("2424235");
		Telefone telefones1 = new Telefone("23241415");

		contato.mostrarTelefones(telefones);
		contato.mostrarTelefones(telefones);

		System.out.println("contato " + contato.getNome());
		System.out.println(contato.getEndereco());
		contato.listaContato();

	}
}