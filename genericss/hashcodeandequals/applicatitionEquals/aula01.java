package applicatitionEquals;

public class aula01 {
	public static void main(String[] args) {
		
//		metodo que compara se o objeto é igual ao outro
		String a = "Maria";
		String b = "Alex";
//		É para retornar FALSE pq string "a" NÃO é igual ao String "b"
		System.out.println(a.equals(b));
		
//		É para retornar TRUE pq string "c" É IGUAL ao String "d"
		String c = "Maria";
		String d = "Maria";
		System.out.println(c.equals(d));
	}
}
