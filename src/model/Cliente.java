package model;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private Livro livro;
    private LocalDate dataAluguel;
    private int dias;
    

    public Cliente(String nome, Livro livro, int dias) {
        this.nome = nome; 
        this.livro = livro;
        this.dataAluguel = LocalDate.now();
        this.dias = dias;
    }

    public double valorTotalAluguel(){
        return livro.getPreco() * dias;
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
        return nome + " - " + "Livro: " + (livro != null ? livro.getTitulo() : "Nenhum livro") + "'" + "| Data do aluguel: " + dataAluguel + "| Dias de aluguel: " + dias + "| Valor total: " + valorTotalAluguel();
    }
  
}
