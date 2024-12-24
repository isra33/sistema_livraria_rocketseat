package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    // private Livro livro;
    private LocalDate dataAluguel;
    private int dias;
    private List<Livro> livros = new ArrayList<>();
    

    public Cliente(String nome, int dias) {
        this.nome = nome;  
        this.dataAluguel = LocalDate.now();
        this.dias = dias;
    }

    public double valorTotalAluguel(){
        return livros.stream().mapToDouble(Livro::getPreco).sum() * dias;
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
   
 
    
    public String getNome() {
        return nome;
    }

    public void formatarLivrosAlugados(){
        StringBuilder livrosAlugados = new StringBuilder();
        for (Livro livro : livros) {
            livrosAlugados.append(livro.getTitulo()).append(", ");
        }
    }

    @Override
    public String toString() {
        StringBuilder livrosAlugados = new StringBuilder();
        for (Livro livro : livros) {
            livrosAlugados.append(livro.getTitulo()).append(", ");
        }

        return nome + " - " + "Livro: " + (livros.isEmpty() ?  "Nenhum livro" : livrosAlugados.toString()) + 
        
        "'" + "| Data do aluguel: " + dataAluguel + "| Dias de aluguel: " + dias + "| Valor total: " + valorTotalAluguel();
    }
  
}
