package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    //Atributos
    private String nome;
    private int idade;
    private double altura;

    //construtor
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    //getters
    public double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    //formatação
    @Override
    public String toString() {
        return "Pessoa {-Nome: "+nome+" -Altura: "+altura+" -Idade: "+idade+"}";
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }
}

//classe auxiliar de Comparator para organizar pela altura das pessoas
class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public String toString() {
        return "ComparatorPorAltura []";
    }

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
    
}
