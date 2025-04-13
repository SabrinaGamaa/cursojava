package aulas;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class EscreverArquvios3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("GetName: " + path.getName());
		System.out.println("GetParent: " + path.getParent());
		System.out.println("GetPath: " + path.getPath());
		
		sc.close();
	}	
}
