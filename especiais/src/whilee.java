import java.util.Scanner;

public class whilee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite números inteiros para descobrir a sua soma total: ");
		
		int num = sc.nextInt();
		
		int soma = 0;
		while (num != 0) {
			soma += num;
			num = sc.nextInt();
			}
		System.out.printf("A soma total é: %d \n", soma);
		
		sc.close();
		
	}
}
