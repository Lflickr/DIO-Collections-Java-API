package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    //Atributos
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    //construtor
    public Produto(String nome, long codigo, double preco, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //getters
    public long getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        
        Produto produto = (Produto) obj;
        return produto.getCodigo() == getCodigo();
    }

    @Override
    public String toString() {
        return "{codigo: "+codigo+" nome: "+nome+" preco: "+preco+" quantidade: "+quantidade+"}";
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto>{
   
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(),p2.getPreco());
    }
}