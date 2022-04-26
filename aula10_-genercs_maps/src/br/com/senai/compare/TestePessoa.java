package br.com.senai.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Adriana", "123647883", 45);
		Pessoa p2 = new Pessoa("Marcos", "2563147883", 25);
		Pessoa p3 = new Pessoa("Joaquim", "56987458", 19);

		List<Pessoa> pessoas = new ArrayList();

		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);

		Collections.sort(pessoas);
		System.out.println(pessoas);

		List<String> cores = new ArrayList<>();
		cores.add("Verde");
		cores.add("Amarelo");
		cores.add("Roxo");

		Collections.sort(cores);
		System.out.println(cores);
	}

}
