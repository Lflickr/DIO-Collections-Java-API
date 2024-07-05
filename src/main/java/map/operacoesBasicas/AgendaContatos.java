package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    //construtor
    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    //metodos
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome=agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Elais", 123456);
        agenda.adicionarContato("Marcelo", 564432);
        agenda.adicionarContato("Leon", 9871234);
        agenda.adicionarContato("Felipe", 3402332);
        agenda.adicionarContato("Getulio", 123456);
        agenda.adicionarContato("Elais", 133456);

        agenda.exibirContatos();

        agenda.pesquisarPorNome("Marcelo");

        agenda.removerContato("Elais");

        agenda.exibirContatos();

    }
}
