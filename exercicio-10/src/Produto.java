public class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public void adicionar(int valor) {
        if (valor > 0) {
            quantidade += valor;
            System.out.printf("%d unidades adicionadas ao estoque.%n", valor);
        } else {
            System.out.println("Valor inválido para adicionar ao estoque.");
        }
    }

    public void remover(int valor) {
        if (valor > 0 && valor <= quantidade) {
            quantidade -= valor;
            System.out.printf("%d unidades removidas do estoque.%n", valor);
        } else if (valor > quantidade) {
            System.out.println("Erro: Não há estoque suficiente para remover essa quantidade.");
        } else {
            System.out.println("Valor inválido para remover do estoque.");
        }
    }

    public void exibirEstoque() {
        System.out.printf("Produto: %s | Quantidade em estoque: %d%n", nome, quantidade);
    }
}