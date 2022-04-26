package br.com.senai.model;

public class TesteImovel {

	public static void main(String[] args) {
		Casa casa = new Casa ("Centro",23564,true);
		Apto apto = new Apto ("Bingen",23564, 4, 23);

		Proprietario p1= new Proprietario (" Maria", casa);
		
		System.out.println("Proprietario"+ p1.getNome());
		System.out.println(p1.getImovel());
	}

}
