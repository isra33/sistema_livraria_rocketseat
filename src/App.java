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

                System.out.println("Digite o valor de aluguel/dia do livro: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Digite o titulo: ");
                String titulo = scanner.nextLine();

                System.out.println("Digite o id do autor: ");
                int idAutor = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o nome do autor: ");
                String nomeAutor = scanner.nextLine();

                biblioteca.adicionarLivro(id, preco, titulo, idAutor, nomeAutor);
            } else if (opcao == 3) {
                System.out.println("###### Alugar livro ######");

                System.out.println("Digite o nome do cliente que quer alugar: ");
                String nome = scanner.nextLine();

                System.out.println("Digite quantos livros quer alugar: ");
                int quantidadeLivros = scanner.nextInt();
                scanner.nextLine();

                for (int i = 0; i < quantidadeLivros; i++) {
                    System.out.println("Digite o ID do livro que deseja alugar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Quantos dias quer alugar o livro? ");
                    int dias = scanner.nextInt();
                    scanner.nextLine();

                    biblioteca.alugarLivro(id, nome, dias);
                }

            } else if (opcao == 4) {
                System.out.println("###### Devolver livro ######");

                System.out.println("Tem certeza que quer devolver o livro? ");
                String confirmacao = scanner.nextLine();

                while (confirmacao.equals("sim")) {

                    System.out.println("Digite o ID do livro que deseja devolver: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    biblioteca.devolverLivro(id);
                    break;// parar o loop após confirmacação
                }

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
