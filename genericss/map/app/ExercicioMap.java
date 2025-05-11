package app;

import entities.Candidato;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "c:\\temp\\candidatos.txt";
        Map<Candidato, Integer> votacao = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                String[] candidatos = line.split(",");
                String name = candidatos[0];
                Integer votos = Integer.valueOf(candidatos[1]);

                Candidato candidato = new Candidato(name);

                if (votacao.containsKey(candidato)){
//                    System.out.println("Testando o get(candidatos): ");
//                    System.out.println(votacao.get(candidato));
//                  Ele não retorna a Key, só retorna o VALUE

                    votacao.put(candidato, votacao.get(candidato) + votos);
                }
                else {
                    votacao.put(candidato, votos);
                }
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Map.Entry<Candidato, Integer> cand : votacao.entrySet()){
            System.out.println(cand.getKey() + ": " + cand.getValue());
        }

    }
}

//Na contagem de voto de uma eleição, são gerados varios registro de votações contendo
//o nome do candidato e a quantidade de votos (formato .csv) que ele obteve em uma urna de
//eleição. Você deve fazer um programa para ler os registro de votação a partir de um arquivo,
//e dai gerar um relatório consolidado com os totais de cada canditado.
