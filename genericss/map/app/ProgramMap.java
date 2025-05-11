package app;

import java.util.Map;
import java.util.TreeMap;

public class ProgramMap {
    public static void main(String[] args) {

//      como o string já tem o metodo equals e compareTO, não preciso criar uma classes com esse metodos
//      como usei o treemap ele ordena de forma alfabetica, então vai ordenar pelas chaves
        Map<String, String> cookies = new TreeMap<>();

//      Para inserir put
        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("senha", "1234567");

//        estou removendo do meu map onde a chave seja igual ao meu key dentro do map
        cookies.remove("email");

        System.out.println("Contains 'senha' key: " + cookies.containsKey("senha"));
        System.out.printf("Contains 'maria' value: %s \n", cookies.containsValue("maria"));
        System.out.printf("Size: %d \n", cookies.size());

        System.out.println();
        System.out.println("ALL COOKIES (sem email pq excluí)");
//      Estou pegando as chaves do meu map na forma de set, estou percorrendo este conjunto
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
