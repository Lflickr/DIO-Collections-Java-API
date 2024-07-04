package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    //Atributos
    private String nome;
    private long matricula;
    private double nota;

    //construtor
    public Aluno(String nome, long mat, double nota){
        this.nome = nome;
        this.matricula = mat;
        this.nota = nota;
    }

    //getters
    public long getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public double getNota() {
        return nota;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || obj.getClass() != getClass()) return false;

        Aluno aluno = (Aluno) obj;
        return aluno.getMatricula() == getMatricula();
    }

    @Override
    public String toString() {
        return "{matricula: "+matricula+" aluno: "+nome+" nota: "+nota+"}"; 
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }
}

class ComparatorPorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getNota(), o2.getNota());
    }
    
}
