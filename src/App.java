import java.util.Scanner;

import model.Biblioteca;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BEM-VINDO A BIBLIOTECA");

        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("1- Listar livros");
            System.out.println("2- Adicionar livro");
            System.out.println("3- Alugar livro");
            System.out.println("4- Devolver livro");
            System.out.println("5- Listar clientes");
            System.out.println("6- Sair");

            System.out.println("Digite a opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("##### LISTA DE LIVROS #####");
                biblioteca.listarLivros();
            } else if (opcao == 2) {
                System.out.println("#### Adicionar livro ####");
                System.out.println("Digite o ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o titulo: ");
                String titulo = scanner.nextLine();

                System.out.println("Digite o id do autor: ");
                int idAutor = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o nome do autor: ");
                String nomeAutor = scanner.nextLine();

                biblioteca.adicionarLivro(id, titulo, idAutor, nomeAutor);
            } else if (opcao == 3) {
                System.out.println("###### Alugar livro ######");
                System.out.println("Digite o ID do livro que deseja alugar: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o nome do cliente que quer alugar: ");
                String nome = scanner.nextLine();

                biblioteca.alugarLivro(id, nome);

            } else if (opcao == 4) {
                System.out.println("###### Devolver livro ######");
                System.out.println("Digite o ID do livro que deseja devolver: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                biblioteca.devolverLivro(id);

            } else if (opcao == 5) {
                System.out.println("###### Lista de clientes ######");

                biblioteca.listarClientes();

            } else if (opcao == 6) {
                System.out.println("Saindo...");
                break;
            }

        }

    }
}
