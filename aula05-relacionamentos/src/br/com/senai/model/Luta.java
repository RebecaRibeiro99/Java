package br.com.senai.model;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private String rounds;
	private String confirmado;

	public Luta(Lutador desafiante, Lutador desafiado, String rounds) {
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.rounds = rounds;
	}

	@Override
	public String toString() {
		return "Luta [desafiante=" + desafiante + ", desafiado=" + desafiado + ", rounds=" + rounds + ", confirmado="
				+ confirmado + "]";
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public String getRounds() {
		return rounds;
	}

	public void setRounds(String rounds) {
		this.rounds = rounds;
	}

	public String getConfirmado() {
		return confirmado;
	}

	public void setConfirmado(String confirmado) {
		this.confirmado = confirmado;
	}

	public String confirmarLuta() {
		if (desafiante != desafiado && desafiante.getCategoriaLuta() == desafiado.getCategoriaLuta()) {
			return confirmado = "Luta confirmada!!";

		} else {
			return confirmado = "Luta cancelada!";

		}
	}
}
