import entities.Exercicio2Funcionarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "c:\\temp\\dados.txt";
        System.out.print("Enter Salary: ");
        Double salary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            List<Exercicio2Funcionarios> list = new ArrayList<>();

            while (line != null){
                String[] lista = line.split(",");
                list.add(new Exercicio2Funcionarios(lista[0], lista[1], Double.valueOf(lista[2])));

                line = br.readLine();
            }

            System.out.printf("Email of people whose salary is more than %.2f: \n", salary);
            List<String> acimaMedia = list.stream()
                    .filter(x -> x.getSalary() > salary)
                    .map(Exercicio2Funcionarios::getEmail)
                    .sorted()
                    .toList();
            acimaMedia.forEach(System.out::println);

            Double somaM = list.stream()
                    .filter(x -> x.getName().toUpperCase().charAt(0) == 'M')
                    .map(Exercicio2Funcionarios::getSalary)
                    .reduce(0.0, Double::sum);


            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", somaM));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
