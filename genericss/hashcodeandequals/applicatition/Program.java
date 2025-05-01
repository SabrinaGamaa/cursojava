package applicatition;

import entitiesPersolizado.Client;

public class Program {
	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println();
//		Aqui tem que dar TRUE pq tanto o name e email vão dar hash iguais
//		Ele vai comparar o conteúdo dos objetos (nome e e-mail), e não as referências de memória
		System.out.println(c1.equals(c2));
		
//		Aqui vai dar FALSE, pois o operador "==" compara as referências de memória (endereços)
//		e não o conteúdo dos objetos. Como c1 e c2 são objetos diferentes, o resultado será false
		System.out.println(c1 == c2);
		
		
		String a = "Test";
		String b = "Test";
//      Sem usar "new", strings com o mesmo conteúdo compartilham a mesma referência no pool e == retorna true
		System.out.println(a == b);
		
	}
}
