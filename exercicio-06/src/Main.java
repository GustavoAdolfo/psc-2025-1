public class Main {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria("João Silva", 500.00);

        System.out.println("Bem-vindo, " + conta.getTitular() + "!");
        conta.verSaldo();


        // Fazendo um primeiro saque com sucesso
        System.out.println("\nTentando sacar R$200.00...");
        conta.sacar(200.00);
        conta.verSaldo();

        // Fazendo um segundo saque com erro
        System.out.println("\nTentando sacar R$400.00...");
        conta.sacar(400.00);
        conta.verSaldo();
    }
}