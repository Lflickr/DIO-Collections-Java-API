package main.java.map.ordenacao;

public class Evento {
    //Atributos
    private String nome;
    private String atracao;

    //Construtor
    public Evento(String nome, String atracao){
        this.atracao = atracao;
        this.nome = nome;
    }

    //getters
    public String getAtracao() {
        return atracao;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "[Evento: "+nome+" atracao: "+atracao+"]";
    }
}
