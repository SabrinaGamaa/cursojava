package applicatitionSet;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ProgramConjunto {
	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 7, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9, 11));
		
		System.out.println("Junção das duas variaveis: ");
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		System.out.println();
		
		System.out.println("Quais elementos tem igual na A e B: ");
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		System.out.println();
		
		System.out.println("Exclui o elementos que tem igual na A e B: ");
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		
		
	}
}
