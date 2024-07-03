package main.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {
        //Exemplo sem utilizar generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento a");
        listaSemGenerics.add(424); //pode adicionar qualquer tipo de objeto

        //Fazendo iteração sobre a lista sem Generics
        //precisa fazer cast nos elementos
        //Object é a classe mae de todas as outras classes em java
        for(Object elemento: listaSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }

        //Exemplo com generics
        List<String> listaGenerics = new ArrayList<>(); //Atravez do diamond operator especifica qual elemento quer gerar
        listaGenerics.add("null");
        listaGenerics.add("Elemento 2"); //So pode adicionar elementos do mesmo tipo, no caso, Strings
        
        //Fazendo iteração em lista com Generics
        for(String elemento: listaGenerics){
            System.out.println(elemento);
        }
    }
}
