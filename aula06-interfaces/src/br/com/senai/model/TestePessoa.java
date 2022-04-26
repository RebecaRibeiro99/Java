package br.com.senai.model;

public class TestePessoa {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Marcos", "Rua a 8 , Centro", 85000, "2534");
		PessoaJuridica pj = new PessoaJuridica("xpto", "Rua a 8 , bingen", 85000, "2534", "Xpo comércio de roupas");
		;
		TotalTributos tt = new TotalTributos();

		tt.totalizarTributos(pj);
		tt.totalizarTributos(pj);

		System.out.println("Total IR: " + pf.calcularImpostoDeRenda());
		System.out.println("Total IR pj: " + pj.calcularImpostoDeRenda());
		System.out.println("Total ICMS PJ: " + pj.calcularICMS());

		System.out.println("Total geral " + tt.getTotal());
	}

}
