public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhes() {
        System.out.println("+----------------------+----------------------+----------------------+");
        System.out.printf("| %-20s | %-20s | %-20s |%n", "Título", "Autor", "Ano de Publicação");
        System.out.println("+----------------------+----------------------+----------------------+");
        System.out.printf("| %-20s | %-20s | %-20d |%n", titulo, autor, anoPublicacao);
        System.out.println("+----------------------+----------------------+----------------------+");
    }
}