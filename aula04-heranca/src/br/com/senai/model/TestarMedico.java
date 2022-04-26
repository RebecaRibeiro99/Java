package br.com.senai.model;

public class TestarMedico {

	public static void main(String[] args) {
      Anestesista anestesista = new Anestesista("123", "Rebeca", 220, 1000);
      Medico medico = new Medico("5656", " Ana",1000);
      
      
      System.out.println(anestesista.toString());
      System.out.println(medico.toString());
      
	}

}
