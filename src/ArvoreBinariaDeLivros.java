public class ArvoreBinariaDeLivros {

    private Node raiz;

    private static class Node {
        Livro livro;
        Node esquerda, direita;

        Node(Livro livro) {
            this.livro = livro;
        }

        public Livro getLivro() {
            return livro;
        }
    }

    // Método para inserir um livro na árvore binária
    public void inserir(Livro livro) {
        raiz = inserirRecursivamente(raiz, livro);
    }

    private Node inserirRecursivamente(Node atual, Livro livro) {
        if (atual == null) {
            return new Node(livro);
        }
        if (livro.getNome().compareToIgnoreCase(atual.livro.getNome()) < 0) {
            atual.esquerda = inserirRecursivamente(atual.esquerda, livro);
        } else if (livro.getNome().compareToIgnoreCase(atual.livro.getNome()) > 0) {
            atual.direita = inserirRecursivamente(atual.direita, livro);
        }
        return atual;
    }

    // Método para listar todos os livros da árvore binária
    public void listarTodosLivros() {
        listarTodosLivrosRecursivamente(raiz);
    }

    private void listarTodosLivrosRecursivamente(Node node) {
        if (node != null) {
            listarTodosLivrosRecursivamente(node.esquerda);
            System.out.println(node.getLivro());
            listarTodosLivrosRecursivamente(node.direita);
        }
    }

    // Método para buscar um livro por título na árvore binária
    public Livro buscarPorTitulo(String titulo) {
        return buscarPorTituloRecursivamente(raiz, titulo);
    }

    private Livro buscarPorTituloRecursivamente(Node atual, String titulo) {
        if (atual == null) {
            return null; // Livro não encontrado
        }

        if (atual.getLivro().getNome().equalsIgnoreCase(titulo)) {
            return atual.getLivro();
        }

        if (titulo.compareToIgnoreCase(atual.getLivro().getNome()) < 0) {
            return buscarPorTituloRecursivamente(atual.esquerda, titulo);
        }

        return buscarPorTituloRecursivamente(atual.direita, titulo);
    }

    // Método para listar livros por autor
    public void listarLivrosPorAutor(String autor) {
        listarLivrosPorAutorRecursivamente(raiz, autor);
    }

    private void listarLivrosPorAutorRecursivamente(Node node, String autor) {
        if (node != null) {
            if (node.getLivro().getAutor().equalsIgnoreCase(autor)) {
                System.out.println(node.getLivro());
            }
            listarLivrosPorAutorRecursivamente(node.esquerda, autor);
            listarLivrosPorAutorRecursivamente(node.direita, autor);
        }
    }

    // Método para listar livros por tema
    public void listarLivrosPorTema(String tema) {
        listarLivrosPorTemaRecursivamente(raiz, tema);
    }

    private void listarLivrosPorTemaRecursivamente(Node node, String tema) {
        if (node != null) {
            if (node.getLivro().getTema().equalsIgnoreCase(tema)) {
                System.out.println(node.getLivro());
            }
            listarLivrosPorTemaRecursivamente(node.esquerda, tema);
            listarLivrosPorTemaRecursivamente(node.direita, tema);
        }
    }

    // Verifica se a árvore está vazia
    public boolean isVazia() {
        return raiz == null;
    }
}
