package main.java.list.Pesquisa;

public class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //construtor
    public Livro(String t, String a, int ano){
        this.anoPublicacao = ano;
        this.autor = a;
        this.titulo = t;
    }

    //getters
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Titulo: "+titulo+" Autor: "+autor+" Ano: "+anoPublicacao;
    }
}
