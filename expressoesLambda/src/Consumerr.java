import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Consumerr {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>(); // Cria uma lista de produtos

        // Adiciona produtos à lista
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));

        // Aplica o método estático 'staticPriceUpdate' em cada produto (aumenta 10% no preço)
        list.forEach(Product::staticPriceUpdate);
        // Imprime todos os produtos após o aumento de preço
        System.out.println("Aplica o método estático 'staticPriceUpdate' em cada produto (aumenta 10% no preço)");
        list.forEach(System.out::println);

        // Cria um Consumer com expressão lambda que também aumenta o preço em 10%
        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * 1.1);
        };

        System.out.println();
        System.out.println("Aplica o Consumer lambda na lista (aumenta novamente mais 10% em cada produto)");
        list.forEach(cons);
        list.forEach(System.out::println);

        System.out.println();
        System.out.println("Expressao lambda inline agora, aumentando novamente mais 10% em cada produto.");
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        list.forEach(System.out::println);
    }
}
