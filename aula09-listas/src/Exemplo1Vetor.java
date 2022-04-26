
public class Exemplo1Vetor {

	public static void main(String[] args) {

		// String[] vetor = { "Celular", " tv", "Blu-Ray" };
		// vetor[2]= "Aparelho de som";

		String[][] funcionario = { { "Ana", "ana@gmail.com" }, { "Joao", "joao@gmail.com" },
				{ "Carla", "carla@gmail.com" } };

		for (int linha = 0; linha < funcionario.length; linha++) {
			for (int coluna = 0; coluna < funcionario[linha].length; coluna++) {
				System.out.printf(funcionario[linha][coluna]+ "|");
			}
			    System.out.printf("\n");
		}
	}

}
