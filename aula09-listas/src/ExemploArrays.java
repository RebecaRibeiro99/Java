import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploArrays {

	public static void main(String[] args) {
		List lista = Arrays.asList("Tv 43","Celular","Kindle");
		//lista.add("Aparelho de som");,n?o posso adcionar coisas novas na lista.
		if (lista.isEmpty()) {
			System.out.println("Lista vazia");
		}else {
			lista.set(1, "Iphone");
			System.out.println(lista.get(1));
			System.out.println("O elemento da posi??o 2 ? kindle? "+ (lista.contains("Kindle")?"Sim":"N?o"));
		}
		Collections.sort(lista);
		System.out.println(lista);
	}

}
