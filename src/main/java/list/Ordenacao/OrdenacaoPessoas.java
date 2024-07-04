package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //Atributos
    private List<Pessoa> listaPessoa;

    //Construtor
    public OrdenacaoPessoas(){
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    //Colections.sort() organiza a lista com base no metodo compareTo da classe Pessoa
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listaPessoa);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.70);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 70, 1.90);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 40, 2.00);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 10, 1.40);
        ordenacaoPessoas.adicionarPessoa("Nome 5", 60, 1.80);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
