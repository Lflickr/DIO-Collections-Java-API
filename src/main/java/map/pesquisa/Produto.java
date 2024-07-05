package main.java.map.pesquisa;

public class Produto {
    //Atributos
    private double preco;
    private String nome;
    private int quantidade;

    //Construtor
    public Produto(double preco, String nome, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //formatacao
    @Override
    public String toString() {
        return "[nome: "+nome+" preco: "+preco+" quantidade: "+quantidade+"]";
    }

    //getters
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }


}
