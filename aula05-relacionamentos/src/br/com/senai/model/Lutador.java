package br.com.senai.model;

public class Lutador {
	private String nome;
	private CategoriaLuta categoriaLuta;
	private int idade;
	private double peso;
	
	
	public Lutador(String nome, CategoriaLuta categoriaLuta, int idade, double peso) {
		super();
		this.nome = nome;
		this.categoriaLuta = categoriaLuta;
		this.idade = idade;
		this.peso = peso;
	}


	@Override
	public String toString() {
		return " Lutador(a) nome= " + nome + ", categoria da Luta = " + categoriaLuta + ", idade= " + idade + ", peso= " + peso
				;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public CategoriaLuta getCategoriaLuta() {
		return categoriaLuta;
	}


	public void setCategoriaLuta(CategoriaLuta categoriaLuta) {
		this.categoriaLuta = categoriaLuta;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}

}
