package org.serratec.constantes;

public class PolicialFederal extends Policial {
	private String matricula;

	public PolicialFederal(String cpf, String nome, double salario, String matricula, String lotacao) {
		super(cpf, nome, salario, lotacao);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

}
