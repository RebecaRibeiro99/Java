/**
 * 
 */
package br.com.senai.model;

public class PessoaFisica extends Pessoa implements Tributos {
	private String cpf;

	PessoaFisica(String nome, String endereco, double rendimentos, String cpf) {
		super(nome, endereco, rendimentos);
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [rendimentos=" + rendimentos + "]";
	}

	@Override
	public double calcularImpostoDeRenda() {
		return rendimentos * irendaPessoaFisica;
	}

	@Override
	public double calcularICMS() {
		return 0;
	}

}
