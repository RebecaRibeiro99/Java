package br.com.senai.model;

public class Telefone {
	private String numero;

	@Override
	public String toString() {
		return "Telefone [numero=" + numero + "]";
	}

	public Telefone(String numero) {
		super();
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

}
