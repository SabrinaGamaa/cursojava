import java.util.Scanner;

public class scannersc3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
 
//		 Ler a linha inteira
		System.out.print("Digite aqui: ");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
 
		System.out.println("Você digitou: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		 
		sc.close();
	}
}
