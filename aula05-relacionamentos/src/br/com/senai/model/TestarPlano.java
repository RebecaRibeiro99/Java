package br.com.senai.model;

public class TestarPlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Sul Am�rica", "Checkup", "1234");
		Medico medico = new Medico("Golden", "123654", "Ana");
		Anestesista anestesista = new Anestesista("Amil", "456", "Carlos", "Geral");

		ControlePagamento cp = new ControlePagamento();

		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();

		cp.calcularTotalPagp(clinica);
		cp.calcularTotalPagp(medico);
		cp.calcularTotalPagp(anestesista);

		System.out.println(clinica);
		System.out.println(medico);
		System.out.println(anestesista);
		System.out.println("O valor total �: " + String.format("%.2f", cp.getTotalPago()));
	}

}
