package br.com.senai.exceptions;

import javax.management.RuntimeErrorException;

public class ContaCorrente implements Conta {
	private String numeroConta;
	private String titular;
	private double saldo;

	ContaCorrente(String numeroConta, String titular, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Numero da Conta: " + numeroConta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public boolean saque(double valor) {
		if (saldo < valor) {
			throw new ContaException("Saldo insulficiente!");
		}
		return true;
	}

	@Override
	public boolean deposito(double valor) {
		if (valor > 1000) {
			throw new ContaException("Deposito acima do permitido!");
		}
		saldo += valor;
		return true;
	}

}
