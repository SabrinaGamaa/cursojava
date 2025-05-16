import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pipelinee {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(p -> p * 10);
//        st1.forEach(System.out::println); --- mostrar cada elemento
        System.out.println();
        System.out.println(Arrays.toString(st1.toArray())); // mostrar lista de elementos

//        int sum = list.stream().reduce(0, (x, y) -> x + y);
        int sum = list.stream().reduce(0, Integer::sum);
        int max = list.stream().reduce(0, Integer::max);
        System.out.println();
        System.out.println("A soma é: " + sum);
        System.out.println("O maior numero é: " + max);

        System.out.println();
        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .toList();
        System.out.println(Arrays.toString(newList.toArray()));
    }
}
