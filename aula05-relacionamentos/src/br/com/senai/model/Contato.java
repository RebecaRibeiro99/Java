package br.com.senai.model;

import java.util.Arrays;

public class Contato {
	private String nome;
	private Endereco endereco;
	private Telefone[] telefones;
	
	

	public Contato(String nome, Endereco endereco, Telefone[] telefones) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefones = telefones;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", endereco=" + endereco + ", telefones=" + Arrays.toString(telefones) + "]";
	}

	public String getNome() {
		return nome;
	}

	public Telefone[] getTelefone() {
		return telefones;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(Telefone[] telefone) {
		this.telefones = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	public void mostrarTelefones(Telefone telefone) {
		for (int i = 0; i < telefones.length; i++) {
			if (telefones[i] == null) {
				telefones[i] = telefone;
				break;
			}
		}

	}

	public void listaContato() {
		for (int i = 0; i < telefones.length; i++) {
			System.out.println("Número de tefefone:" + telefones[i].getNumero());
		}
	}
}
