package br.com.senai.model;

public class Medico extends Plano {
	protected String crm;
	protected String nomeMedico;

	public Medico(String nome, String crm, String nomeMedico) {
		super(nome);
		this.crm = crm;
		this.nomeMedico = nomeMedico;
	}

	@Override
	public String toString() {
		return super.toString() + "crm" + crm + " " + "nome: " + nomeMedico;
	}

	public String getCrm() {
		return crm;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	@Override
	public double calcularPagamento() {
		valorPago = super.calcularPagamento() * 1.10;
		return valorPago;

	}

}
