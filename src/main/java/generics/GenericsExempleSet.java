package main.java.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExempleSet {
    public static void main(String[] args) {
        //Exemplo sem Generics
        Set conjuntoSemGenerics = new HashSet(); //Conjunto sem tipo especifico
        conjuntoSemGenerics.add("Elemento A");
        conjuntoSemGenerics.add(124);

        //Fazendo iteração no conjunto sem generics
        //precisa de cast
        for(Object elemento: conjuntoSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }

        //Exemplo com Generics
        Set<String> conjuntoComGenerics = new HashSet<>(); //Conjunto de apenas tipo String
        conjuntoComGenerics.add("Elemento 1");
        conjuntoComGenerics.add("Elemento 2");

        //Fazendo iteração no conjunto com generics
        for(String elemento: conjuntoComGenerics){
            System.out.println(elemento);
        }
    }
}
