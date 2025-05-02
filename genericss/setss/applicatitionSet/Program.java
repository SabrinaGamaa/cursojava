package applicatitionSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
//		O HashSet não garante a ordem dos itens dentro do set
//		O TreeSet ordena os dados dentro do set, mas perde velocidade
//		O LinkedHashSet mantem a ordem que os elementos foram inseridos
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

		System.out.print("Tem o objeto 'Notebook' dentro da variavel set: ");
		System.out.println(set.contains("Notebook"));
		
		set.remove("Notebook");
		
//		Vou remover todos os elementos que tiver mais de 3 caracter
		set.removeIf(x -> x.length() >= 3);
//		Posso também selecionar pela letra
		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println();
		System.out.println("Liste todos os os itens dentro do set: ");
		for(String p : set) {
			System.out.println(p);
		}
		
	}
	
}
