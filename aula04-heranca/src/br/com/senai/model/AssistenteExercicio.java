package br.com.senai.model;

public class AssistenteExercicio extends FuncionarioExercicio {
    private double adicional;

    public AssistenteExercicio(String nome, String cpf, double salario, String turno) {
        super(nome, cpf, salario, turno);
    }
    @Override
    public String toString() {
        return super.toString();
    }

    public double getAdicional() {
        adicional = salario * 0.002;
        return adicional;
    }

    @Override
    public void aumentarSalario(double aumento) {
        salario += (salario * 0.02);
    }
}