package br.com.senai.model;

public class Estado {
	private String nomeEstado;
	private String sigla;

	@Override
	public String toString() {
		return "Estado [nomeEstado=" + nomeEstado + ", sigla=" + sigla + "]";
	}

	public Estado(String nomeEstado, String sigla) {
		super();
		this.nomeEstado = nomeEstado;
		this.sigla = sigla;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public String getSigla() {
		return sigla;
	}

}
