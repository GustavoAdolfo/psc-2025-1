public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
            return false;
        }
        saldo -= valor;
        System.out.printf("Saque de R$%.2f realizado com sucesso.%n", valor);
        return true;
    }

    public void verSaldo() {
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
    }

    public String getTitular() {
        return titular;
    }
}