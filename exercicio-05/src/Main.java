import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite o consumo do carro (km por litro): ");
        double consumoPorLitro = scanner.nextDouble();

        Carro carro = new Carro(modelo, consumoPorLitro);

        System.out.print("Digite a quantidade de litros de combustível disponível: ");
        double litros = scanner.nextDouble();

        double distancia = carro.autonomia(litros);
        System.out.printf("O carro modelo %s pode percorrer até %.2f km com %.2f litros de combustível.%n",
                carro.getModelo(), distancia, litros);

        scanner.close();
    }
}