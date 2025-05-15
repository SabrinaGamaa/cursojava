import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Streamm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> stream1 = list.stream();
        System.out.println(Arrays.toString(stream1.toArray()));

        Stream<String> stream2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(stream2.toArray()));

//      Quem é o primeito item da minha lista, e qual é a função de geraçao dos proximos elementos
        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(stream3.limit(10).toArray()));

//      Cria um stream de arrays [a, b] iniciando em [0, 1], atualiza para [b, a+b] e extrai p[0] para gerar a sequência de Fibonacci.
        Stream<Long> stream4 = Stream.iterate(new long[]{ 0L, 1L }, p -> new long[]{ p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(stream4.limit(10).toArray()));

        System.out.println();
        System.out.println("TESTES");
        stream1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(stream1.toArray()));
    }
}
