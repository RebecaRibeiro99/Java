package br.com.senai.datahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExemploDataHora {

	public static void main(String[] args) {
		LocalTime hora = LocalTime.now();// .now pega a hora do sistema
		System.out.println(hora);
		System.out.println(LocalTime.of(22, 10));

		LocalDate dataAtual = LocalDate.now();
		LocalDateTime dataHora = LocalDateTime.of(2022, 4, 1, 22, 10);
		System.out.println(dataHora);// retorna o que eu escrevi
		System.out.println(LocalDateTime.now());// retorna tudo do sistema

		DateTimeFormatter dft = DateTimeFormatter.ofPattern("hh:mm:ss");// edito o queeu quero que apareca quando
																		// determino pelo sistema
		System.out.println(dataHora.format(dft));
	}

}
