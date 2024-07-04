package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //Atributos
    List<Integer> listaNumeros;

    //construtor
    public SomaNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    //metodos
    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!listaNumeros.isEmpty()){
            for(Integer i: listaNumeros){
                soma+=i;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;
        if(!listaNumeros.isEmpty()){
            for(Integer i: listaNumeros){
                if(i > maior){
                    maior = i;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor=0;
        if(!listaNumeros.isEmpty()){
            menor = listaNumeros.get(0);
            for(Integer i: listaNumeros){
                if(i < menor){
                    menor = i;
                }
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println(listaNumeros);
    }

    //testando os metodos
    public static void main(String[] args) {
        SomaNumeros valores = new SomaNumeros();

        //os metodos de encontrar maior e menor retornam zero se a lista estiver vazia
        System.out.println(valores.encontrarMenorNumero());
        System.out.println(valores.encontrarMaiorNumero());

        valores.adicionarNumero(10);
        valores.adicionarNumero(15);
        valores.adicionarNumero(1);
        valores.adicionarNumero(2);
        valores.adicionarNumero(12);

        System.out.println(valores.calcularSoma());
        System.out.println(valores.encontrarMenorNumero());
        System.out.println(valores.encontrarMaiorNumero());

        valores.exibirNumeros();
    }
}
