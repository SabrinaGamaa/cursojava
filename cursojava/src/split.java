
public class split {

	public static void main(String[] args) {
		String s = "potato aplle lemon orange banana";
		
//		Como se fosse a lista em python
		String[] vect = s.split(" ");
//		String word1 = vect[0];
//		String word2 = vect[1];
//		String word3 = vect[2];
		
		int tamanho = vect.length;
		for (int i=0; i<tamanho; i++) {
			System.out.printf("%d° - %s\n", i+1, vect[i]);
		}
		
//		for (String nome: vect) {
//			System.out.println(nome);
//		}
	}

}

//%f - ponto flutuante
//%d - numero inteiro
//%s - String
//\n - quebra de linha





