package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    //Atributos
    private Set<Convidado> convidadoSet;

    //construtor
    public ConjuntoConvidado(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadosParaRemover =null;
        for(Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadosParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadosParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem "+ conjuntoConvidado.contarConvidados()+ "dentro do Set de convidados");

        conjuntoConvidado.adicionarConvidado("Nome 1", 1234);
        conjuntoConvidado.adicionarConvidado("Nome 2", 1235);
        conjuntoConvidado.adicionarConvidado("Nome 3", 1236);
        conjuntoConvidado.adicionarConvidado("Nome 4", 1237);
        conjuntoConvidado.adicionarConvidado("Nome 5", 1238);
        conjuntoConvidado.adicionarConvidado("Nome 6", 1238);

        

        conjuntoConvidado.exibirConvidados();
        System.out.println("Existem "+ conjuntoConvidado.contarConvidados()+ "dentro do Set de convidados");

        conjuntoConvidado.removerConvidadoPorCodigoConvite(1234);
        conjuntoConvidado.exibirConvidados();

    }
}
