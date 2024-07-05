package main.java.map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //Atributos
    private Map<LocalDate, Evento> eventosMap;

    //construtor
    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventosMap);
        System.out.println(eventosOrdenados);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate,Evento> entry: eventosOrdenados.entrySet()){
            if(entry.getKey().isEqual(dataAtual)||entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento: "+entry.getValue()+" ocorrera em: "+entry.getKey());
                break;
            }
        }
    }
}
