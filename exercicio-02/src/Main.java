public class Main {
    public static void main(String[] args) {
        Produto produto001 = new Produto("Produto Teste 001", 100.0);
        System.out.println("Nome do produto: " + produto001.getNome());
        System.out.println("Preço do produto: " + produto001.getPreco());
        double percentualDesconto = 20.0;
        System.out.println("Percentual de desconto: " + percentualDesconto + "%");
        double precoFinal = produto001.precoComDesconto(percentualDesconto);
        System.out.println("Preço final após desconto: " + precoFinal);
        
        System.out.println();

        Produto produto002 = new Produto("Produto Teste 002",75.5);
        System.out.println("Nome do produto: " + produto002.getNome());
        System.out.println("Preço do produto: " + produto002.getPreco());
        percentualDesconto = 15.0;
        System.out.println("Percentual de desconto: " + percentualDesconto + "%");
        precoFinal = produto002.precoComDesconto(percentualDesconto);
        System.out.println("Preço final após desconto: " + precoFinal);
    }
}