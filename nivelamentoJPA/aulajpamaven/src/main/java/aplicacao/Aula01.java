package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Aula01 {
    public static void main(String[] args) {

        Pessoa ps1 = new Pessoa(null, "Silva", "silva@gmail.com");
        Pessoa ps2 = new Pessoa(null, "Gabi", "gabi@gmail.com");
        Pessoa ps3 = new Pessoa(null, "Lulu", "lulu@gmail.com");

        // Cria o EntityManagerFactory a partir da unidade de persistência "exemplo-jpa"
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        // Cria o EntityManager para interações com o banco de dados
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(ps1);
        em.persist(ps2);
        em.persist(ps3);
        em.getTransaction().commit();
        System.out.println("Dados inseridos com sucesso!");

//      Como recuperar um dado que está salvo em um banco de dados
        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);

//        Como remover
//        O objeto precisa está monitorado
        Pessoa r = em.find(Pessoa.class, 5);
        em.getTransaction().begin();
        em.remove(r);
        em.getTransaction().commit();
        System.out.println("Pronto!");

        em.close();
        emf.close();
    }
}
