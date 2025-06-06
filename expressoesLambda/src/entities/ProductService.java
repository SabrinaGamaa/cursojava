package entities;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    // Primeira maneira de forma que a condição fique "presa" em uma maneira só - public double filteredSum(List<Product> list){
    public double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0;
        for (Product p : list){
            if (criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
