public class Livro {

    private String nome;
    private String autor;
    private int anoDePublicacao;

    public Livro(String nome, String autor, int anoDePublicacao) {
        this.nome = nome;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    @Override
    public String toString() {
        return String.format("Título: %s, Autor: %s, Ano: %d", nome, autor, anoDePublicacao);
    }
}
