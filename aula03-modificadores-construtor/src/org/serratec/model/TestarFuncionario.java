package org.serratec.model;

public class TestarFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Juliana", 2000);

        System.out.println("Nome: " + f1.getNome() + "\nSalário: "+ f1.getSalario());
        System.out.println("INSS: " + f1.calcularINSS());
        System.out.println("Vale Transporte: " + f1.calcularValeTransporte());
        System.out.println("Salario líquido: " + f1.salarioLiquido());
    }

}