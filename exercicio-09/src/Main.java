import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        Aluno aluno = new Aluno(nome);

        System.out.println("Digite as notas do aluno (digite 'p' para parar):");
        while (true) {
            System.out.print("Nota: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("p")) {
                break;
            }
            try {
                double nota = Double.parseDouble(input);
                aluno.adicionarNota(nota);
            } catch (NumberFormatException e) {
                System.out.println("ERRO! Por favor, insira um número ou 'p' para parar.");
            }
        }

        double media = aluno.calcularMedia();
        String situacao = media >= 7.0 ? "aprovado" : "reprovado";

        System.out.printf("O aluno %s obteve média %.2f e está %s.%n", aluno.getNome(), media, situacao);

        scanner.close();
    }
}