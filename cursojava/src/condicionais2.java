import java.util.Scanner;

public class condicionais2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.print("Digite a hora: ");
		hora = sc.nextInt();
		
		
//		Se exister apenas um comando dentro do if ou else eu não preciso colocar chaves
		if (hora < 12) 
			System.out.println("Bom dia!");
		
//		Assim como do else se tiver outro comando if eu posso deixar sem chaves
		else if (hora < 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
		
		sc.close();
	}
}
