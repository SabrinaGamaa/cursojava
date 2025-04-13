package aulas;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class EscreverArquvios2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
//		DIRETORIOS
		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
//		ARQUIVOS
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}
		
//		CRIAR UM SUB-PAST APARTIR DA PASTA TEMP
		boolean sucess = new File(strPath + "\\subpasta").mkdir();
//		if (sucess) - assim já daria certo também
		if (sucess == true) {
			System.out.println("Sub-Pasta criada com sucesso! ");
		}
		else {
			System.out.println("Não foi possível criar a pasta. ");
		}
		
		sc.close();
	}	
}
