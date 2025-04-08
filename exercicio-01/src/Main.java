import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);
        System.out.println(pessoa.saudar());

        scanner.close();
    }
}