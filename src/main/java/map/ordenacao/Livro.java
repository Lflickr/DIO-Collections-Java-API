package main.java.map.ordenacao;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private double preco;

    //Construtor
    public Livro(String titulo, String autor, double preco){
        this.autor = autor;
        this.titulo = titulo;
        this.preco = preco;
    }
    //getters
    public String getAutor() {
        return autor;
    }
    public double getPreco() {
        return preco;
    }
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livro {titulo: "+titulo+" autor: "+autor+" preco: "+preco+"}";
    }
}

class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return Double.compare(o1.getValue().getPreco(), o2.getValue().getPreco());
    }

   
}