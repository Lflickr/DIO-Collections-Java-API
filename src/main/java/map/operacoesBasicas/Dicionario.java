package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //Atributos
    Map<String, String> dicionarioMap;

    //construtor
    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }

    //metodos
    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraEncontrada = null;
        if(!dicionarioMap.isEmpty()){
            palavraEncontrada = dicionarioMap.get(palavra);
        }
        return palavraEncontrada;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("null", "null");
        dicionario.adicionarPalavra("palavra1", "definicao1");
        dicionario.adicionarPalavra("palavra2", "definicao2");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("palavra2"));

        dicionario.removerPalavra("null");

        dicionario.exibirPalavras();

    }
}
