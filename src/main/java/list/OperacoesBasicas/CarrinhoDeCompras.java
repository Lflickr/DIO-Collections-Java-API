package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Atributos
    private List<Item> carrinho;

    //Construtor
    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for(Item i: carrinho){
            if(i.getNome().equalsIgnoreCase(nome))
                itensParaRemover.add(i);
        }

        carrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for(Item i: carrinho){
            total += (i.getPreco() * i.getQuantidade());
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    //testando os metodos
    public static void main(String[] args) {
        CarrinhoDeCompras carr = new CarrinhoDeCompras();

        System.out.println("Valor total do carrinho:" +carr.calcularValorTotal());

        carr.adicionarItem("Mouse", 220, 1);
        carr.adicionarItem("Teclado", 300, 1);
        carr.adicionarItem("Monitor", 100, 2);

        System.out.println("Valor total do carrinho:" +carr.calcularValorTotal());

        carr.removerItem("Monitor");
        System.out.println("Valor total do carrinho:" +carr.calcularValorTotal());

        carr.exibirItens();
    }
}
