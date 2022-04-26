package br.com.senai.generics;

public class TesteSorteio {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Ana", "Analista de sistema", "Cpd");
		Funcionario f2 = new Funcionario("Ana Maria", "Advogado", "Juridicos");
		Funcionario f3 = new Funcionario("Jos�", "Engenheiro", "Projetos");
		Funcionario f4 = new Funcionario("Catarina", "Auxuliar", "Dp");

		Sorteio<Funcionario> sorteio = new Sorteio<Funcionario>();
		sorteio.adicionar(f1);
		sorteio.adicionar(f2);
		sorteio.adicionar(f3);
		sorteio.adicionar(f4);
		Funcionario funcionario = sorteio.sortear();
		System.out.println(funcionario);

		Sorteio<Integer> sortearNumeros = new Sorteio<Integer>();
		sortearNumeros.adicionar(100);
		sortearNumeros.adicionar(200);
		sortearNumeros.adicionar(300);
		sortearNumeros.adicionar(400);
		Integer i = sortearNumeros.sortear();
		System.out.println(i);
	}

}
