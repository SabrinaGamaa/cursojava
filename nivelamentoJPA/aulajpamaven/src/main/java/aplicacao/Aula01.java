package aplicacao;

import dominio.Pessoa;

public class Aula01 {
    public static void main(String[] args) {

        Pessoa ps1 = new Pessoa(1, "João", "joao@gmail.com");
        Pessoa ps2 = new Pessoa(2, "Maria", "maria@gmail.com");
        Pessoa ps3 = new Pessoa(3, "Lucas", "lucas@gmail.com");

        System.out.println(ps1);
        System.out.println(ps2);
        System.out.println(ps3);

    }
}
