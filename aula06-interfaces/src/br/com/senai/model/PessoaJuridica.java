package br.com.senai.model;

public class PessoaJuridica extends Pessoa implements Tributos {
	private String cnpj;
	private String razaoSocial;

	PessoaJuridica(String nome, String endereco, double rendimentos, String cnpj, String razaoSocial) {
		super(nome, endereco, rendimentos);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	@Override
	public double calcularImpostoDeRenda() {
		return rendimentos * irendaPessoaJuridica;
	}

	@Override
	public double calcularICMS() {
		return rendimentos * icms;
	}

}
