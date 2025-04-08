import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        System.out.print("Digite o ano de publicação do livro: ");
        int anoPublicacao = scanner.nextInt();

        Livro livro = new Livro(titulo, autor, anoPublicacao);
        System.out.println("\nDetalhes do Livro:");
        livro.exibirDetalhes();

        scanner.close();
    }
}