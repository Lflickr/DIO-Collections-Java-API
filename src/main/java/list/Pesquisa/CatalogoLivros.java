package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributos
    List<Livro> catalogo;

    //Construtor
    public CatalogoLivros(){
        this.catalogo = new ArrayList<>();
    }

    //metodos
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!catalogo.isEmpty()){
            for(Livro l: catalogo){
                if(l.getAutor().equalsIgnoreCase(autor))
                    livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(!catalogo.isEmpty()){
            for(Livro l: catalogo){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                    livrosPorIntervalo.add(l);
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livro = null;
        if(!catalogo.isEmpty()){
            for(Livro l: catalogo){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livro = l;
                    break;
                }
            }
        }
        return livro;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogolivros = new CatalogoLivros();

        catalogolivros.adicionarLivro("Livro 1", "Autor 1", 2000);
        catalogolivros.adicionarLivro("Livro 2", "Autor 3", 2010);
        catalogolivros.adicionarLivro("Livro 3", "Autor 2", 2005);
        catalogolivros.adicionarLivro("Livro 4", "Autor 1", 2009);
        catalogolivros.adicionarLivro("Livro 1", "Autor 2", 2001);

        System.out.println(catalogolivros.pesquisarPorAutor("Autor 1"));

        System.out.println(catalogolivros.pesquisaPorIntervaloAnos(2000, 2005));

        System.out.println(catalogolivros.pesquisarPorTitulo("Livro 1"));
    }
}
