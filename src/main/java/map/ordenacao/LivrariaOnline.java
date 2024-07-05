package main.java.map.ordenacao;

import java.util.*;


public class LivrariaOnline {
    //Atributos
    private Map<String, Livro> livraria;

    //Construtor
    public LivrariaOnline(){
        this.livraria = new HashMap<>();
    }

    //metodos
    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livraria.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        List<String> chavesParaRemover = new ArrayList<>();
        for(Map.Entry<String, Livro> entry : livraria.entrySet()){
            if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                chavesParaRemover.add(entry.getKey());
                
            }
        }
        for(String chave: chavesParaRemover){
            livraria.remove(chave);
        } 
    }

    public void exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosOrdenados = new ArrayList<>(livraria.entrySet());
        Collections.sort(livrosOrdenados, new ComparatorPorPreco());
        System.out.println(livrosOrdenados);
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosPorAutor = new HashMap<>();

        for(Map.Entry<String, Livro> entry: livraria.entrySet()){
            Livro livro = entry.getValue();

            if(livro.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }



    public List<Livro> obterLivroMaisCaro(){
        List<Livro> livrosMaisCaro = new ArrayList<>();
        double maiorValor = Double.MIN_VALUE; 

        if(!livraria.isEmpty()){
            //descobrir o maior valor
            for(Livro l: livraria.values()){
                if(l.getPreco() > maiorValor){
                    maiorValor = l.getPreco();
                }
            }
            //achar os livros com este valor
            for(Map.Entry<String, Livro> entry: livraria.entrySet()){
                if(entry.getValue().getPreco() == maiorValor){
                    // Livro livroComPrecoMaisAlto = livraria.get(entry.getKey());
                    // livrosMaisCaro.add(livroComPrecoMaisAlto);
                    livrosMaisCaro.add(entry.getValue());
                }
            }
        }
        return livrosMaisCaro;
    }

    public List<Livro> obterLivroMaisBarato(){
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double menorValor = Double.MAX_VALUE;

        if(!livraria.isEmpty()){
            //descobrir o menor valor
            for(Livro l: livraria.values()){
                if(l.getPreco() < menorValor){
                    menorValor = l.getPreco();
                }
            }
            //achar os livros com estes valores
            for(Map.Entry<String, Livro> entry: livraria.entrySet()){
                if(entry.getValue().getPreco() == menorValor){
                    livrosMaisBaratos.add(entry.getValue());
                }
            } 
        }
        return livrosMaisBaratos;
    }

    public void exibirLivros(){
        System.out.println(livraria);
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun","A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        // Exibe todos os livros ordenados por preç0
        livrariaOnline.exibirLivrosOrdenadosPorPreco();
        System.out.println("\n\n");

        //Exibe todos os livros de um autor
        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("George Orwell"));
        System.out.println("\n\n");

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());
        System.out.println("\n\n");

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());
        System.out.println("\n\n");

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        
        livrariaOnline.exibirLivros();
    }
}   
