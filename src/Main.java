public class Main {

    public static void main(String[] args) {
        GerenciadorDeLivros gerenciador = new GerenciadorDeLivros();
        GerenciadorDeLivros.ListaEncadeada<Livro> listaLivros = gerenciador.new ListaEncadeada<>();

        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        listaLivros.add(livro1);
        listaLivros.add(livro2);
        listaLivros.add(livro3);

        System.out.println("Elemento na posição 1: " + listaLivros.get(1));
        listaLivros.remove(1);
        System.out.println("Tamanho da lista: " + listaLivros.size());

        // Exibir todos os livros restantes
        for (int i = 0; i < listaLivros.size(); i++) {
            System.out.println(listaLivros.get(i));
        }
    }
}
