import java.util.ArrayList;
import java.util.List;


public class TestePessoa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Amarildo", "amarildo@gmail.com", 55);
		Pessoa p2 = new Pessoa("Carlos", "carlos@gmail.com", 39);
		Pessoa p3 = new Pessoa("Carla", "Carla@gmail.com", 18);
		Cliente c1 = new Cliente("Marcio");

		List <Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
	//	pessoas.add(c1);

		// pessoas.addAll();

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
