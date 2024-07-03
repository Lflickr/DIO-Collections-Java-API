package main.java.generics;

import java.util.HashMap;
import java.util.Map;

public class GenericsExempleMap {
    public static void main(String[] args) {
        //Exemplo sem generics
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave 1", 10);
        mapaSemGenerics.put("Chave 2", "oi");// pode ser qualquer valor

        //iterando sem generics
        //Tem que fazer cast
        for(Object obj: mapaSemGenerics.entrySet()){
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String)entry.getKey();
            int valor = (int) entry.getValue();
            System.out.println("Chave: "+chave+", Valor: "+valor);
        }

        //Exemplo com generics
        Map<String, Integer> mapaGenerics = new HashMap<>();// valores especificados na criação do objeto
        mapaGenerics.put("Chave 1", 10);
        mapaGenerics.put("Chave 2", 20);

        //Iterando no mapa com generics
        for(Map.Entry<String, Integer> entry: mapaGenerics.entrySet()){
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: " +chave+", Valor: "+valor);
        }
    }
}
