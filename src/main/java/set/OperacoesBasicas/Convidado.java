package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    //Atributos
    private String nome;
    private int codigoConvite;

    //construtor
    public Convidado(String nome, int codigoConvite){
        this.codigoConvite = codigoConvite;
        this.nome = nome;
    }

    //getters
    public int getCodigoConvite() {
        return codigoConvite;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Convidado conv = (Convidado) obj;
        return getCodigoConvite() == conv.getCodigoConvite();
    }

    //formatação
    @Override
    public String toString() {
        return "{nome: "+nome+" codigo: "+codigoConvite+"}";
    }
}
