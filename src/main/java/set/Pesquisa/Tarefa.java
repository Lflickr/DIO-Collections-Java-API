package main.java.set.Pesquisa;

import java.util.Objects;

public class Tarefa {
    //Atributos
    String descricao;
    boolean concluida;

    //Construtor
    public Tarefa(String descricao, boolean concluida){
        this.descricao = descricao;
        this.concluida = concluida;
    }

    //getters
    public String getDescricao() {
        return descricao;
    }
    public boolean getConcluida(){
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    @Override
    public String toString() {
        return "{Tarefa: "+descricao+" concluida: "+concluida+"}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || obj.getClass() != getClass()) return false;

        Tarefa tar = (Tarefa) obj;
        return getDescricao() == tar.getDescricao();
    }
}
