package main.java.list.Ordenacao;

public class Numero implements Comparable<Numero> {
    //Atributos
    int numero;
    
    //construtor
    public Numero(int numero){
        this.numero = numero;
    }

    //getters
    public int getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Numero n) {
        return Integer.compare(numero, n.getNumero());
    }

    @Override
    public String toString() {
        return ""+numero;
    }


}
