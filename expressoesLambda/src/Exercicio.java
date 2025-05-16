import entities.ExercicioProduct;
import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String path = "c://temp//produtos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            List<ExercicioProduct> list = new ArrayList<>();

            while (line != null) {
                String[] prod = line.split(",");
                String nomeProduto = prod[0];
                Double priceProduto = Double.valueOf(prod[1]);

                list.add(new ExercicioProduct(nomeProduto, priceProduto));

                line = br.readLine();
            }

//            double media = list.stream()
//                    .map(ExercicioProduct::getPrice)
//                    .reduce(0.0, Double::sum) / list.size();
            double media = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / list.size();


            System.out.println("Average price: " + String.format("%.2f", media));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> acimaMedia = list.stream()
                    .filter(x -> x.getPrice() < media)
                    .map(ExercicioProduct::getName) // p -> p.getName
                    .sorted(comp.reversed())
                    .toList();

            acimaMedia.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
