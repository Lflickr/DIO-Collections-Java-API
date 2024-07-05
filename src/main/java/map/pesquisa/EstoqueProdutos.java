package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //Atributos
    private Map<Long, Produto> produtosMap;

    //Construtor
    public EstoqueProdutos(){
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        produtosMap.put(cod, new Produto(preco, nome, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(produtosMap);
    }

    public double calcularValorTotalEstoque(){
        double totalEstoque = 0;
        if(!produtosMap.isEmpty()){
            for(Produto p: produtosMap.values()){
                totalEstoque += (p.getPreco() * p.getQuantidade());
            }
        }
        return totalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto maisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!produtosMap.isEmpty()){
            for(Produto p: produtosMap.values()){
                if(p.getPreco() > maiorPreco){
                    maisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return maisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto maisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!produtosMap.isEmpty()){
            for(Produto p: produtosMap.values()){
                if(p.getPreco() < menorPreco){
                    maisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return maisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto maisQuantidadeValor = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!produtosMap.isEmpty()){
            for(Produto p: produtosMap.values()){
                if((p.getQuantidade()*p.getPreco()) > maiorPreco){
                    maisQuantidadeValor = p;
                    maiorPreco = (p.getPreco()*p.getQuantidade());
                }
            }
        }
        return maisQuantidadeValor;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(123, "Sabonete", 2, 2);
        estoqueProdutos.adicionarProduto(111, "Bola", 2, 10);
        estoqueProdutos.adicionarProduto(8, "Biribinha", 4, 1);
        estoqueProdutos.adicionarProduto(23, "Sorvete", 5, 9);

        estoqueProdutos.exibirProdutos();

        System.out.println("O valor total do estoque e: "+estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: "+estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: "+estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto com maior valor total em quantidade: "+estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());


    }
}
