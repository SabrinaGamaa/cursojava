package entitiesGenerics;

import java.util.ArrayList;
import java.util.List;

//Posso usar qualquer outra String dentro <> que ela ainda se torna generic
public class PrintService<T> {

//	Se o meu PrintService e um tipo T qualquer a minha lista também tem que ser um tipo T
	List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is emply");
		}
		
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[ ");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		
		for (int i = 1; i < list.size(); i ++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println(" ]");
	}
	
}
