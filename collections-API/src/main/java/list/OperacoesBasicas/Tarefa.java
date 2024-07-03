package main.java.list.OperacoesBasicas;

public class Tarefa {
    //Atributos
    private String descricao;

    //Construtor
    public Tarefa(String desc){
        this.descricao = desc;
    }

    public String getDescricao() {
        return descricao;
    }

    //metodo auxiliar para formatar a impressao de um objeto Tarefa
    @Override
    public String toString() {
        return "Tarefa{ descricao= '" + descricao + "'}"; 
    }
}
