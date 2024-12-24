package model;

import java.time.LocalDate;

public class Livro {
    private int id;
    private String titulo;
    private double preco;
    private Autor autor;
    private boolean disponivel;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    public Livro(int id, double preco, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.disponivel = true;
        this.dataCadastro = LocalDate.now(); // lembrar de sempre inicializar as datas
        this.dataAtualizacao = LocalDate.now(); // lembrar de semopre inicializar as datas
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        this.dataAtualizacao = LocalDate.now();
    }
 
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setId(int id) {
        this.id = id;
        this.dataAtualizacao = LocalDate.now(); 
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
        this.dataAtualizacao = LocalDate.now();
    }

    @Override
    public String toString() {
        return 
        "ID do livro: " + id + 
        "Preço do aluguel/dia: " + preco +
        ", titulo do livro: " + titulo + 
        " | ID do autor: " + autor.getId() +
         " | Nome do autor: " + autor.getNome() +
          "| " + (disponivel ? "Disponivel" : "Indisponivel"  +
        "| Data de cadastro: " + dataCadastro + 
        "| Data de atualização: " + dataAtualizacao
        );
    }

    public double getPreco() {
        return preco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

}
