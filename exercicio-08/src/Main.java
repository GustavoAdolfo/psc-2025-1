import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número da operação: ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o primeiro valor: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double b = scanner.nextDouble();

        try {
            double resultado = 0;
            switch (operacao) {
                case 1:
                    resultado = calculadora.soma(a, b);
                    System.out.printf("Resultado da soma: %.2f%n", resultado);
                    break;
                case 2:
                    resultado = calculadora.subtrair(a, b);
                    System.out.printf("Resultado da subtração: %.2f%n", resultado);
                    break;
                case 3:
                    resultado = calculadora.multiplicar(a, b);
                    System.out.printf("Resultado da multiplicação: %.2f%n", resultado);
                    break;
                case 4:
                    resultado = calculadora.dividir(a, b);
                    System.out.printf("Resultado da divisão: %.2f%n", resultado);
                    break;
                default:
                    System.out.println("Operação inválida.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}