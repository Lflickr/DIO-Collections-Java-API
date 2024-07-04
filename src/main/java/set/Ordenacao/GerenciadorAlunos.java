package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //Atributos
    private Set<Aluno> alunoSet;

    //Construtor
    public GerenciadorAlunos(){
        alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if(!alunoSet.isEmpty()){
            for(Aluno a: alunoSet){
                if(a.getMatricula() == matricula)
                    alunoParaRemover = a;
                    break;
            }
        }
        alunoSet.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        
        gerenciadorAlunos.adicionarAluno("Vanderlei", 132, 10);
        gerenciadorAlunos.adicionarAluno("Ana", 152, 9);
        gerenciadorAlunos.adicionarAluno("Rogerio", 113, 8);

        gerenciadorAlunos.exibirAlunos();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.removerAluno(113);
        gerenciadorAlunos.exibirAlunos();


    }
}
