public class GerenciadorDeLivros {

    private ArvoreBinariaDeLivros arvore = new ArvoreBinariaDeLivros();

    // Adicionar livro à árvore binária
    public void adicionarLivro(Livro livro) {
        arvore.inserir(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    // Listar todos os livros da árvore binária
    public void listarLivros() {
        if (arvore.isVazia()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("Lista de livros:");
            arvore.listarTodosLivros();
        }
    }

    // Buscar livro pelo título (usando a árvore binária)
    public Livro buscarLivroPorTitulo(String titulo) {
        return arvore.buscarPorTitulo(titulo);
    }

    // Recomendar livros pelo autor (usando a árvore binária)
    public void recomendarLivrosPorAutor(String autor) {
        arvore.listarLivrosPorAutor(autor);
    }

    // Recomendar livros por tema (usando a árvore binária)
    public void recomendarLivrosPorTema(String tema) {
        arvore.listarLivrosPorTema(tema);
    }
}
