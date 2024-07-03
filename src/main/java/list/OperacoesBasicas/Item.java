package main.java.list.OperacoesBasicas;

public class Item {
    //Atributos
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor
    public Item(String n, double p, int q){
        this.nome = n;
        this.preco = p;
        this.quantidade = q;
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

    //metodo de formataçao
    @Override
    public String toString() {
        return  "-Nome do item: "+nome+" -Preço: "+preco+" -Quantidade: "+quantidade;
    }
    
}
