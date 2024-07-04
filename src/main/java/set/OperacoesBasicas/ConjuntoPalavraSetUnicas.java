package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavraSetUnicas {
    //Atributos
    Set<String> palavraSet;

    //construtor
    public ConjuntoPalavraSetUnicas(){
        this.palavraSet = new HashSet<>();
    }

    //metodos
    public void adicionarPalavra(String palavra){
        palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        for(String p: palavraSet){
            if(p.equalsIgnoreCase(palavra)){
                palavraParaRemover = p;
                break;
            }
        }
        palavraSet.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra){
        boolean verificarcao = false;
        for(String p: palavraSet){
            if(p.equalsIgnoreCase(palavra)){
                verificarcao = true;
                break;
            }
        }
        return verificarcao;
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavraSetUnicas palavrasUnicas = new ConjuntoPalavraSetUnicas();

        palavrasUnicas.adicionarPalavra("Sala");
        palavrasUnicas.adicionarPalavra("Cozinha");
        palavrasUnicas.adicionarPalavra("Quarto");
        palavrasUnicas.adicionarPalavra("Sala");
        palavrasUnicas.adicionarPalavra("Jardim");

        System.out.println(palavrasUnicas.verificarPalavra("null"));
        System.out.println(palavrasUnicas.verificarPalavra("Sala"));

        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.removerPalavra("Sala");
        palavrasUnicas.exibirPalavrasUnicas();
    }
}
