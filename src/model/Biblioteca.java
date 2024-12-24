package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> livros = new ArrayList<>();
    List<Autor> autores = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente);
        }
    }

    public void adicionarLivro(int id,double preco, String titulo, int idAutor, String nomeAutor) {
        livros.add(new Livro(id, preco, titulo, new Autor(idAutor, nomeAutor)));
    }

    public void alugarLivro(int id, String nomeCliente, int dias) {

        // Buscar o livro pelo IDD
        Livro livro = null;
        for (Livro livroId : livros) {
            if (livroId.getId() == id) {
                livro = livroId;
                break;
            }
        }

        // verificar se o livro foi encontrrado
        if (livro == null) {
            System.out.println("Livro com ID: " + id + " não encontrado");
            return;
        }

        if (!livro.isDisponivel()) {
            System.out.println("Livro indisponível para aluguel.");
            return;
        }
        livro.setDisponivel(false);

        // procurar cliente existentee
        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nomeCliente)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        // associando o livro ao cliente existenteie
        if (clienteEncontrado != null) {
            clienteEncontrado.adicionarLivro(livro);
        } else {
            //senao tiver cliente existente, cria um novo cliente!!
            Cliente novoCliente = new Cliente(nomeCliente,  dias);
            novoCliente.adicionarLivro(livro);
            clientes.add(novoCliente);
        }

    }

    public void devolverLivro(int id) {
        // bbuscaar o livro pelo ID
        Livro livro = null;
        for (Livro livroId : livros) {
            if (livroId.getId() == id) {
                livro = livroId;
                break;
            }
        }

        // verificar se o livro foi encontradoii
        if (livro == null) {
            System.out.println("Livro com ID: " + id + " não encontrado");
            return;
        }

        // verificar se o livro já está dispsonível
        if (livro.isDisponivel()) {
            System.out.println("O livro já está disponível.");
            return;
        }

        //adicionaa como disponivel
        livro.setDisponivel(true);

        System.out.println("Livro: " + livro.getTitulo() + " devolvido com sucesso!");
    }
}
