import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a largura do retângulo (em metros): ");
        double largura = scanner.nextDouble();

        System.out.print("Informe a altura do retângulo (em metros): ");
        double altura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);
        double area = retangulo.calcularArea();
        System.out.printf("A área do retângulo é: %.2f metros quadrados.%n", area);

        scanner.close();
    }
}