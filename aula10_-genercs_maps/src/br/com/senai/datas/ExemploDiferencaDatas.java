package br.com.senai.datas;

import java.time.LocalDate;
import java.time.Period;

public class ExemploDiferencaDatas {

	public static void main(String[] args) {
		LocalDate dataAniversario = LocalDate.of(1975,06,14);
		LocalDate hoje = LocalDate.now();
		System.out.println("Dia da sema:" + hoje.getDayOfWeek().name());
		System.out.println("M?s"+ hoje.getMonthValue());
		System.out.println("Ano"+ hoje.getDayOfYear());
		
		Period periodo = Period.between(dataAniversario, hoje);
		System.out.println("Pessaram:"+ periodo.getYears()+"anos");
		System.out.println(periodo.getMonths()); 
		System.out.println(periodo.getDays());
		
		
	}

}
