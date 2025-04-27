package aulaGenerics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entitiesGenerics.CalculationService;
import entitiesProgram.Product;

public class aula02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		String path = "c:\\temp\\genericosdelimitados.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Most expensive: ");
			System.out.println(x);
		}
		
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
}
