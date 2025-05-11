import entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product produto1, Product produto2) {
        return produto1.getName().toUpperCase().compareTo(produto2.getName().toUpperCase());
    }
}
