package br.com.senai.model;

public class pessoaFisica extends impostoDeRenda {
    private String cpf;
    private String rg;

    public pessoaFisica(String nome, double rendimentos, String cpf, String rg) {
        super(nome, rendimentos);
        this.cpf = cpf;
        this.rg = rg;
    }
    @Override
    public String toString() {
        return super.toString() + "\nCpf: " + cpf + "\nRG: " + rg + "\nCalculo IR: " + calculoIR();
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public double calculoIR() {
        double totalRendimento = rendimentos * 0.12;
        return totalRendimento;
    }
}