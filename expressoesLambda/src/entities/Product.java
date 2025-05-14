package entities;

public class Product {
    private String name;
    private Double price;

    // Construtor que inicializa o nome (final) e o preço do produto
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Retorna o nome do produto
    public String getName() {
        return name;
    }

    public  void setName(String name){
        this.name = name;
    }

    // Retorna o preço atual do produto
    public Double getPrice() {
        return price;
    }

    // Atualiza o preço do produto
    public void setPrice(Double price) {
        this.price = price;
    }

    // Método ESTÁTICO que aumenta o preço do produto em 10%
    // Precisa receber um objeto Product como parâmetro
    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }

    // Método NÃO ESTÁTICO que aumenta o preço do próprio objeto em 10%
    public void nonStaticPriceUpdate(){
        setPrice(getPrice() * 1.1);
    }

    // Método ESTÁTICO que transforma os nomes em caixa baixa
    public static String staticLowerCaseName(Product p){
        return p.getName().toLowerCase();
    }

    // Método NÃO ESTÁTICO que transforma os nomes em caixa alta
    public String nonStaticUpperCaseName(){
        return getName().toUpperCase();
    }

    // Retorna uma string formatada com o nome e o preço do produto
    @Override
    public String toString() {
        return "Produtos: "
                + name
                + " R$"
                + String.format("%.2f", price);
    }
}
