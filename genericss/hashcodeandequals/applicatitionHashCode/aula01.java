package applicatitionHashCode;

public class aula01 {
	public static void main(String[] args) {
//		metodo que retorna um número inteiro representado um código gerado a partir das informações do objeto
		
		String a = "Maria";
		String b = "Alex";
//		É para retornar FALSE pq string "a" NÃO é igual ao String "b"
		System.out.println("Maria - " + a.hashCode());
		System.out.println();
		System.out.println("Alex - " + b.hashCode());
		
//		Dados diferentes geram Hash diferente, dados iguais tem que ter o Hash númerico iguais.
//		Lembrando que a geração de números é 32 bits, então pode haver colisões, o que é muito raro, mas pode ocorrer
		
	}
}
