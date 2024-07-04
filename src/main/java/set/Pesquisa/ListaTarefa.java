package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    //Atributos
    Set<Tarefa> tarefaSet;

    //Construtor
    public ListaTarefa(){
        tarefaSet = new HashSet<>();
    }

    //metodos
    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao) && !t.getConcluida()){
                    tarefaParaRemover = t;
                    break;
                }
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if(!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                if(t.getConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if(!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                if(!t.getConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(true);
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(false);
                }
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefa tarefas = new ListaTarefa();

        tarefas.adicionarTarefa("Lavar louça");
        tarefas.adicionarTarefa("Arrumar quarto");
        tarefas.adicionarTarefa("Fazer exercicios");

        tarefas.exibirTarefas();

        System.out.println("Existem "+tarefas.contarTarefas()+" tarefas na lista");

        System.out.println("Tarefas pendentes: "+tarefas.obterTarefasPendentes());
        System.out.println("Tarefas concluidas: "+ tarefas.obterTarefasConcluidas());

        tarefas.marcarTarefaConcluida("Lavar louça");

        System.out.println("Existem "+tarefas.contarTarefas()+" tarefas na lista");

        System.out.println("Tarefas pendentes: "+tarefas.obterTarefasPendentes());
        System.out.println("Tarefas concluidas: "+ tarefas.obterTarefasConcluidas());

        tarefas.marcarTarefaPendente("Lavar louça");
        System.out.println("Existem "+tarefas.contarTarefas()+" tarefas na lista");

        System.out.println("Tarefas pendentes: "+tarefas.obterTarefasPendentes());
        System.out.println("Tarefas concluidas: "+ tarefas.obterTarefasConcluidas());

        tarefas.removerTarefa("Lavar louça");

        tarefas.exibirTarefas();
        System.out.println("Tarefas pendentes: "+tarefas.obterTarefasPendentes());
        System.out.println("Tarefas concluidas: "+ tarefas.obterTarefasConcluidas());

        tarefas.limparListaTarefas();
        tarefas.exibirTarefas();
        System.out.println("Tarefas pendentes: "+tarefas.obterTarefasPendentes());
        System.out.println("Tarefas concluidas: "+ tarefas.obterTarefasConcluidas());

    }
}
