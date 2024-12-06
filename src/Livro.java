public class Livro {

    private String nome;
    private String autor;
    private int anoDePublicacao;
    private String tema;

    public Livro(String nome, String autor, int anoDePublicacao, String tema) {
        this.nome = nome;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.tema = tema;
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

    public String getTema() {
        return tema;
    }


    @Override
    public String toString() {
        return String.format("Título: %s, Autor: %s, Ano: %d, Tema: %s", nome, autor, anoDePublicacao, tema);
    }
}
