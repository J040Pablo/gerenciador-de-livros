public class GerenciadorDeLivros {

    private ListaEncadeada<Livro> lista = new ListaEncadeada<>();

    public void adicionarLivro(Livro livro) {
        lista.add(livro);
        System.out.println("Livro adicionado.");
    }

    public void listarLivros() {
        if (lista.size() == 0) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public void ordenarPorTitulo() {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j).getNome().compareTo(lista.get(j + 1).getNome()) > 0) {
                    Livro temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (int i = 0; i < lista.size(); i++) {
            Livro livro = lista.get(i);
            if (livro.getNome().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    // Classe interna para a estrutura de lista encadeada
    private static class ListaEncadeada<T> {
        private Node<T> head;
        private int size;

        private static class Node<T> {
            T data;
            Node<T> next;

            Node(T data) {
                this.data = data;
                this.next = null;
            }
        }

        public ListaEncadeada() {
            this.head = null;
            this.size = 0;
        }

        public void add(T elemento) {
            Node<T> novoNo = new Node<>(elemento);
            if (head == null) {
                head = novoNo;
            } else {
                Node<T> atual = head;
                while (atual.next != null) {
                    atual = atual.next;
                }
                atual.next = novoNo;
            }
            size++;
        }

        public T get(int indice) {
            if (indice < 0 || indice >= size) {
                throw new IndexOutOfBoundsException("Índice inválido");
            }
            Node<T> atual = head;
            for (int i = 0; i < indice; i++) {
                atual = atual.next;
            }
            return atual.data;
        }

        public void set(int indice, T elemento) {
            if (indice < 0 || indice >= size) {
                throw new IndexOutOfBoundsException("Índice inválido");
            }
            Node<T> atual = head;
            for (int i = 0; i < indice; i++) {
                atual = atual.next;
            }
            atual.data = elemento;
        }

        public int size() {
            return size;
        }
    }
}
