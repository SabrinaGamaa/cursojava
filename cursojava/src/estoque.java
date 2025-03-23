import java.util.Locale;
import java.util.Scanner;
import comorientacaoaobjeto.Product;


public class estoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------ ESTOQUE ------");
		System.out.println("Enter product data:");
		System.out.print("Nome: ");
		
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product produtos = new Product(name, price);
		
		
//		Printar a lista de produto
		System.out.println("Product data: " + produtos.toString());
		
		

		
//		Adicione mais estoque
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		produtos.addedStock(sc.nextInt());
		System.out.println("Update data" + produtos.toString());
		
//		Remover qntd item
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		produtos.removeStock(sc.nextInt());
		System.out.println("Update data: " + produtos.toString());
		
		
		sc.close();
		
	}
}
