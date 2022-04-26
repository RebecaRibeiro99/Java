package org.serratec.model;

public class TesteFornecedor {

	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("123123123321", "xpto Ltda", "22378611");
		Fornecedor f2 = new Fornecedor("123123123322", "abc Ltda", "22378611");
		Fornecedor f3 = new Fornecedor("123123123323", "abcd Ltda", "22378611");

		System.out.println(f1.getRazaoSocial());
		System.out.println(f2.getRazaoSocial());
		System.out.println(f3.getRazaoSocial());

		System.out.println("O número total de fornecedores é:" + Fornecedor.getContador());

	}

}
