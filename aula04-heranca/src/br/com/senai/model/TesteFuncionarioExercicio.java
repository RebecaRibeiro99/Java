package br.com.senai.model;

public class TesteFuncionarioExercicio {

    public static void main(String[] args) {
        GerenteExercicio gerente = new GerenteExercicio("Fulano", "254.458.666-52", 2000, "Tarde", "Alimentos");
        AssistenteExercicio assistente = new AssistenteExercicio("Gabriel", "142.254.365-25", 2000, "Tarde");
        gerente.aumentarSalario(gerente.salario);
        assistente.aumentarSalario(assistente.salario);
        System.out.println(gerente);
        System.out.println(assistente);
    }
}