import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Listas {

	public static void main(String[] args) {
		List lista = new ArrayList();
		lista.add("Celular");
		lista.add("tv 42");
		lista.add("Kindle");
		System.out.println(lista);
		System.out.println(lista.size());
		System.out.println(lista.remove(0));
		//System.out.println(lista);
		System.out.println(lista.get(1));
		lista.set(0, "TV 43");

		for (Object object : lista) {
			System.out.println(lista);

		}
	}
}