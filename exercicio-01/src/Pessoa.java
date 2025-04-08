public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String saudar() {
        return "Olá " + nome + "! Você tem " + idade + " anos. Bem vindo ao evento!";
    }
}