package aulaGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoringaDelimitado {
	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>(); // Lista destino (aceita qualquer tipo de objeto)

		copy(myInts, myObjs); // Copia inteiros para a lista de objetos
		printList(myObjs);

		copy(myDoubles, myObjs); // Copia doubles para a mesma lista
		printList(myObjs);
	}

	// Método genérico que copia de uma lista que produz (extends Number) para outra
	// que consome (super Number)
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number); // Seguro porque sabemos que Number é compatível com super Number
		}
	}

	// Método que apenas lê a lista
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " "); // Impressão genérica, sem necessidade de saber o tipo exato
		}
		System.out.println();
	}
}
