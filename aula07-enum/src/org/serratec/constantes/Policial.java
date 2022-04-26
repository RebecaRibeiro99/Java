package org.serratec.constantes;

public class Policial {
	protected String cpf;
	protected String nome;
	protected double salario;
	protected final String lotacao;
	protected static int totalPoliciais;

	public Policial(String cpf, String nome, double salario, String lotacao) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
		this.lotacao = lotacao;
		totalPoliciais++;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getLotacao() {
		return lotacao;
	}

	public static int getTotalPoliciais() {
		return totalPoliciais;
	}

	public final String mostrarInformacoes() {
		return nome + "-" + cpf + "-" + salario;

	}

}
