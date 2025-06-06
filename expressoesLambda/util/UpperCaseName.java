package util;

import entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product n) {
        return n.getName().toUpperCase();
    }
}
