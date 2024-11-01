import java.util.Arrays;

public class GerenciadorDeLivros {

    public class ListaEncadeada<T> {
        private Node<T> head;
        private int size;

        // Representa um nó
        private static class Node<T> {
            T data;
            Node<T> next;

            Node(T data) {
                this.data = data;
                this.next = null;
            }
        }

        // Inicializar a lista
        public ListaEncadeada() {
            this.head = null;
            this.size = 0;
        }

        // Adicionar elemento no final
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

        // Remover elemento
        public void remove(int indice) {
            if (indice < 0 || indice >= size) {
                throw new IndexOutOfBoundsException("Indíce Invalido");
            }
            if (indice == 0) {
                head = head.next;
            } else {
                Node<T> atual = head;
                for (int i = 0; i < indice - 1; i++) {
                    atual = atual.next;
                }
                atual.next = atual.next.next;
            }
            size--;
        }

        // Obter tamanho da lista
        public int size() {
            return size;
        }

        // Obter elemento pelo índice
        public T get(int indice) {
            if (indice < 0 || indice >= size) {
                throw new IndexOutOfBoundsException("Indíce Invalido");
            }
            Node<T> atual = head;
            for (int i = 0; i < indice; i++) {
                atual = atual.next;
            }
            return atual.data;
        }
    }
}
