import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Functionn {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));

//        Preciso converter a lista para stream - converter para lista de novo
//        map só funciona para STRING, por isso a conversão de list para stream
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        names.forEach(System.out::println);

        System.out.println();
//      Quero colocar todos os nomes dos produtos com caixa alta
        list.forEach(n -> n.setName(n.getName().toUpperCase()));
        list.forEach(System.out::println);

//        Method estatico
        System.out.println();
        List<String> namesLower = list.stream().map(Product::staticLowerCaseName).collect(Collectors.toList());
        namesLower.forEach(System.out::println);

//        Method  não estatico
        System.out.println();
        List<String> namesUpper = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
        namesUpper.forEach(System.out::println);

    }
}
