package model;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private Livro livro;
    private LocalDate dataAluguel;
    

    public Cliente(String nome, Livro livro) {
        this.nome = nome; 
        this.livro = livro;
        this.dataAluguel = LocalDate.now();
    }

   
 
    public void setLivro(Livro livro) {
        this.livro = livro;
        this.dataAluguel = LocalDate.now();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " - " + "Livro: " + (livro != null ? livro.getTitulo() : "Nenhum livro") + "'" + "| Data do aluguel: " + dataAluguel;
    }
  
}
