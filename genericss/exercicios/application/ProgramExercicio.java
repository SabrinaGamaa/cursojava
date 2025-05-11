package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class ProgramExercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("Alex quer saber seu números de alunos (não pode repetir o aluno): ");
        System.out.print("Quantos estudantes para aula A: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            a.add(number);
        }

        System.out.println("Quantos estudantes para aula B: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            b.add(number);
        }

        System.out.println("Quantos estudantes para aula C: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            c.add(number);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("O total de alunos do Alex é: " + total.size());


        sc.close();
    }
}
