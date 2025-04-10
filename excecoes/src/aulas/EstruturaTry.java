package aulas;

import java.util.InputMismatchException;
import java.util.Scanner;

//Trutura try-catch
public class EstruturaTry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		method1();
		System.out.println("FIM do programa!");
		 
		sc.close();
	}
	
	public static void method1() {
		System.out.println("===== METHOD 1 =====");
		method2();
		System.out.println("===== METHOD END =====");
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("***** METHOD 2 ******");
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			
			System.out.printf("A posição %d está: %s \n", position, vect[position]);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("O número que você digitou não é valído.");
//			Vai imprimir todo o caminha do erro do arrayIndexOut
			e.printStackTrace();
			sc.next();
		}
		
		catch (InputMismatchException e) {
			System.out.println("Por favor, digite apenas número.");
		}
		sc.close();
		System.out.println("***** METHOD 2 ******");
		
	}
}
