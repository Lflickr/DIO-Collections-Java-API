package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //Atributos
    private Map<String, Integer> contadorPalavras;

    public ContagemPalavras() {
        this.contadorPalavras = new HashMap<>();
    }
    
    public void adicionarPalavra(String palavra, Integer contagem){
        contadorPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        contadorPalavras.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(contadorPalavras);
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int frequencia = 0;
        if(!contadorPalavras.isEmpty()){
            for(Map.Entry<String,Integer> p: contadorPalavras.entrySet()){
                if(p.getValue() > frequencia){
                    palavraMaisFrequente = p.getKey();
                    frequencia = p.getValue();
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contPalavras = new ContagemPalavras();

        contPalavras.adicionarPalavra("null", 1);
        contPalavras.adicionarPalavra("requeijao", 5);
        contPalavras.adicionarPalavra("detergente", 2);

        contPalavras.exibirContagemPalavras();
        System.out.println(contPalavras.encontrarPalavraMaisFrequente());

        contPalavras.removerPalavra("null");
        contPalavras.exibirContagemPalavras();
    }
}
