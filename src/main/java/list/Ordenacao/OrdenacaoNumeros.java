package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //Atributos
    List<Integer> listaInteiros;

    //construtor
    public OrdenacaoNumeros(){
        this.listaInteiros = new ArrayList<>();
    }

    //Metodos
    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaOrdenada = new ArrayList<>(listaInteiros);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaOrdenada = new ArrayList<>(listaInteiros);
        Collections.sort(listaOrdenada);
        Collections.reverse(listaOrdenada);
        return listaOrdenada;
    }

    public void exibirNumeros(){
        System.out.println(listaInteiros);
    }

    

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(0);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(90);
        numeros.adicionarNumero(0);

        numeros.exibirNumeros();
        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());
    }
}
