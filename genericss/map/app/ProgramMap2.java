package app;

import entities.Product;

import java.util.HashMap;
import java.util.Map;

public class ProgramMap2 {
    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

//      Sem o hashcode e equals isso da falso pq usa a comparação de ponteiro, então temos que adicionar na classe produto o hashcode e equals para comparação
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }
}
