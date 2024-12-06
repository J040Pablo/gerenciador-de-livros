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
            System.out.println("5. Recomendar livros por autor");
            System.out.println("6. Recomendar livros por tema");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String nome = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de publicação: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tema: ");
                    String tema = scanner.nextLine();
                    gerenciador.adicionarLivro(new Livro(nome, autor, ano, tema));
                    break;
                case 2:
                    gerenciador.listarLivros();
                    break;
                case 3:
                    System.out.println("Não é necessário ordenar livros por título. Eles já estão ordenados na árvore.");
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
                case 5:
                    System.out.print("Informe o nome do autor: ");
                    String autorBusca = scanner.nextLine();
                    gerenciador.recomendarLivrosPorAutor(autorBusca);
                    break;
                case 6:
                    System.out.print("Informe o tema: ");
                    String temaBusca = scanner.nextLine();
                    gerenciador.recomendarLivrosPorTema(temaBusca);
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
