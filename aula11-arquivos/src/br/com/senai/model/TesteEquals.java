package br.com.senai.model;

public class TesteEquals {

	public static void main(String[] args) {
		Empregado e1 = new Empregado ("Pedro","Analista");
		Empregado e2 = new Empregado ("Ana","Analista");
	if(e1.equals(e2)) {
		System.out.println("Iguais!");
	}else {
		System.out.println("Diferentes");
	}
	}

}
