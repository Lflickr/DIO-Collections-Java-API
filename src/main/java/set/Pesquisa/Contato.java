package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {
    //Atributos
    private String nome;
    private int numeroTelefone;

    //Construtor
    public Contato(String nome, int numeroTelefone){
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public int getNumeroTelefone() {
        return numeroTelefone;
    }
    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    //formatacao
    @Override
    public String toString() {
        return "{nome: "+nome+" tel: "+numeroTelefone+"}";
    }

    //definindo o atributo a ser utilizado como codigo unico
    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    //definindo a forma de comparacao
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Contato contato = (Contato) obj;
        return getNome() == contato.getNome();
    }
}
