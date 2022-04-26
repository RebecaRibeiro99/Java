package exercicio;

public class PesoAltura {

	public static void main(String[] args) {
		PesoAltura1 codigo1 = new PesoAltura1();
		
		codigo1.nome = "Júlio";
		codigo1.peso = 80.0;
		codigo1.altura = 1.80;
		
		PesoAltura1 codigo2 = new PesoAltura1();
		codigo2.nome = "Gabriel";
		codigo2.peso = 95.0;
		codigo2.altura = 1.80;
		
		PesoAltura1 codigo3 = new PesoAltura1();
		codigo3.nome = "Cocielo";
		codigo3.peso = 92.0;
		codigo3.altura = 1.90;
		
		PesoAltura1 codigo4 = new PesoAltura1();
		codigo4.nome = "Vinícius";
		codigo4.peso = 82.0;
		codigo4.altura = 1.76;

		if(codigo1.peso > codigo2.peso && codigo1.peso > codigo3.peso && codigo1.peso > codigo4.peso) {
			System.out.println(codigo1.nome + " tem " + codigo1.peso + "kg, portanto tem o maior peso.");
		}else if(codigo2.peso > codigo1.peso && codigo2.peso > codigo3.peso && codigo2.peso > codigo4.peso) {
			System.out.println(codigo2.nome + " tem " + codigo2.peso + "kg, portanto tem o maior peso.");
		}else if(codigo3.peso > codigo1.peso && codigo3.peso > codigo2.peso && codigo3.peso > codigo4.peso) {
			System.out.println(codigo3.nome + " tem " + codigo3.peso + "kg, portanto tem o maior peso.");
		}else if(codigo4.peso > codigo1.peso && codigo4.peso > codigo2.peso && codigo4.peso > codigo3.peso) {
			System.out.println(codigo4.nome + " tem " + codigo4.peso + "kg, portanto tem o maior peso.");

		}if(codigo1.peso < codigo2.peso && codigo1.peso < codigo3.peso && codigo1.peso < codigo4.peso) {
			System.out.println(codigo1.nome + " tem " + codigo1.peso + "kg, portanto tem o menor peso.");
		}else if(codigo2.peso < codigo1.peso && codigo2.peso < codigo3.peso && codigo2.peso < codigo4.peso) {
			System.out.println(codigo2.nome + " tem " + codigo2.peso + "kg, portanto tem o menor peso.");
		}else if(codigo3.peso < codigo1.peso && codigo3.peso < codigo2.peso && codigo3.peso < codigo4.peso) {
			System.out.println(codigo3.nome + " tem " + codigo3.peso + "kg, portanto tem o menor peso.");
		}else if(codigo4.peso < codigo1.peso && codigo4.peso < codigo2.peso && codigo4.peso < codigo3.peso) {
			System.out.println(codigo4.nome + " tem " + codigo4.peso + "kg, portanto tem o menor peso.");

			
		}
		double mediaPeso = ((codigo1.peso + codigo2.peso + codigo3.peso + codigo4.peso)/4);;
		System.out.printf("A média de peso é: %.2f" ,mediaPeso);
		System.out.printf("kg");
		double mediaAltura = ((codigo1.altura + codigo2.altura + codigo3.altura + codigo4.altura)/4);
		System.out.printf("\nA média de altura é: %.2f" ,mediaAltura);
		System.out.printf("m");
		
	}
		
}