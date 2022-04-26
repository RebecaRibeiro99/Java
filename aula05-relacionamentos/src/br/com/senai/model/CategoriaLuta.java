package br.com.senai.model;

public class CategoriaLuta {
	private int codigoLuta;
	private String nomeCategoria;

	public CategoriaLuta(int codigoLuta, String nomeCategoria) {
		super();
		this.codigoLuta = codigoLuta;
		this.nomeCategoria = nomeCategoria;
	}

	@Override
	public String toString() {
		return "Categoria da Luta Codigo Luta= " + codigoLuta + ", Nome Categoria= " + nomeCategoria ;
	}

	public int getCodigoLuta() {
		return codigoLuta;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

}
