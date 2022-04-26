package br.com.senai.exceptions;

public class TesteConta {

	public static void main(String[] args) {
	Conta cc= new ContaCorrente("123", "Roni", 1000);
	
	
	try {
		cc.deposito(1100);
		cc.saque(200);
		
	} catch (ContaException e) {
		System.out.println(e.getMessage());
	}

	}

}
