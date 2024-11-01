import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeLivros gerenciador = new GerenciadorDeLivros();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Ordenar livros por título");
            System.out.println("4. Buscar livro por título");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String nome = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de publicação: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    gerenciador.adicionarLivro(new Livro(nome, autor, ano));
                    break;
                case 2:
                    gerenciador.listarLivros();
                    break;
                case 3:
                    gerenciador.ordenarPorTitulo();
                    System.out.println("Livros ordenados por título.");
                    break;
                case 4:
                    System.out.print("Informe o título do livro: ");
                    String tituloBusca = scanner.nextLine();
                    Livro livroEncontrado = gerenciador.buscarLivroPorTitulo(tituloBusca);
                    if (livroEncontrado != null) {
                        System.out.println("Livro encontrado: " + livroEncontrado);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
