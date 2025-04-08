public class Carro {
    private String modelo;
    private double consumoPorLitro;

    public Carro(String modelo, double consumoPorLitro) {
        this.modelo = modelo;
        this.consumoPorLitro = consumoPorLitro;
    }

    public double autonomia(double litros) {
        return litros * consumoPorLitro;
    }

    public String getModelo() {
        return modelo;
    }
}