import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparador {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        list.sort(new MyComparator());

        for (Product p : list){
            System.out.println(p);
        }

        System.out.println();

        List<Product> list2 = new ArrayList<>();

        list2.add(new Product("Chuteira", 600.00));
        list2.add(new Product("Bola", 250.00));
        list2.add(new Product("Meia", 80.00));

//            @Override
//            public int compare(Product p, Product price) {
//                return p.getName().toUpperCase().compareTo(price.getName().toUpperCase());
//        Comparator<Product> comp = (p, price) -> p.getName().toUpperCase().compareTo(price.getName().toUpperCase());


        list2.sort((p, price) -> p.getName().toUpperCase().compareTo(price.getName().toUpperCase()));

        for (Product p : list2){
            System.out.println(p);
        }
    }
}
