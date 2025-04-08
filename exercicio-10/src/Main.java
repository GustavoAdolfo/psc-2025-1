import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade inicial em estoque: ");
        int quantidadeInicial = scanner.nextInt();

        Produto produto = new Produto(nome, quantidadeInicial);

        System.out.print("Digite a quantidade a ser adicionada ao estoque: ");
        int entrada = scanner.nextInt();
        produto.adicionar(entrada);

        System.out.print("Digite a quantidade a ser removida do estoque: ");
        int saida = scanner.nextInt();
        produto.remover(saida);

        System.out.println("\nEstoque final:");
        produto.exibirEstoque();

        scanner.close();
    }
}