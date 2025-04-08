import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2);

        double media = aluno.calcularMedia();
        String situacao = media >= 6.0 ? "aprovado" : "reprovado";

        System.out.printf("Situação: %s com média %.2f.%n", situacao, media);

        scanner.close();
    }
}