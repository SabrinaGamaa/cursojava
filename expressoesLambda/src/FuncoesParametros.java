import entities.Product;
import entities.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FuncoesParametros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));


        ProductService ps = new ProductService();
        double N = ps.filteredSum(list, p -> p.getName().charAt(0) == 'N');
        double T = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        double todos = ps.filteredSum(list, p -> p.getPrice() > 0);
        System.out.printf("A soma do produto que começa com N: %.2f \n", N);
        System.out.printf("A soma do produto que começa com T: %.2f \n", T);
        System.out.printf("A soma da lista é: %.2f \n", todos);


    }
}
