package vect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class arrayListsss {
	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Sabrina");
		lista.add("Joao");
		lista.add("Janaina");
		lista.add("Raimundo");
		
		lista.add(2, "Anna");
			
//		lista.remove("Anna");
//		lista.remove(2);
		
		System.out.println(lista.size());
//		Se eu quiser remove todos com um predicato
//		Função lambda
		lista.removeIf(x -> x.charAt(0) == 'A');
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		
//		Igual python, se não encontrar o elemento retorn -1 
		System.out.println("Index OF Sabrina: " + lista.indexOf("Sabrina"));
		System.out.println("----------------------------------------------");
		
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		for (String nome : result) {
			System.out.println(nome);
		}
		
		System.out.println("----------------------------------------------");
		String name = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		
	}
}
