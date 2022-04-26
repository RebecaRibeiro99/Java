package br.com.senai.model;

public class testeIR {

    public static void main(String[] args) {
        pessoaFisica ir1 = new pessoaFisica("Gabriel", 11000, "123.454.654-12", "50.254.332-9");
        pessoaJuridica ir2 = new pessoaJuridica("Rebeca", 11000, "343.466.654-10", "23425556");

        System.out.println(ir1);
        System.out.println("---------");
        System.out.println(ir2);

    }

}