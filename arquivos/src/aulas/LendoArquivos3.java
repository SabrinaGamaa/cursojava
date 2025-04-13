package aulas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//TRY-WITH-RESOURCES

public class LendoArquivos3 {
	public static void main(String[] args) {
		
		String path = "c:\\temp\\arquivoteste1.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}	
}
