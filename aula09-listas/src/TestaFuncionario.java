
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario [] funcionarios = new Funcionario[3];
		funcionarios[0]= new Funcionario("Tales", "Gerente de ti", 8000);
		funcionarios[1]= new Funcionario("Mariana", "Diretora de ti", 9000);
		funcionarios[2]= new Funcionario("Adriana", "Programadora", 6000);
	
		
	for (Funcionario funcionario : funcionarios) {
		System.out.println("------------------------------------");
		System.out.println(funcionario+ "\nSalario com abono:R$ " + funcionario.abonoSalario(100));
	}
	}

}
