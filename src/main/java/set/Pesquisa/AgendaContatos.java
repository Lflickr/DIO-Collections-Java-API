package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributo
    private Set<Contato> contatoSet;

    //Construtor
    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    //metodos
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoEncontrados = new HashSet<>();

        if(!(contatoSet.isEmpty())){
            for(Contato c: contatoSet){
                if(c.getNome().startsWith(nome)){
                    contatoEncontrados.add(c);
                }
            }
        }
        return contatoEncontrados;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c:  contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Adilssu", 12);
        agenda.adicionarContato("Alessandro Pereira", 13);
        agenda.adicionarContato("Italo", 52);
        agenda.adicionarContato("Alessandro Silva", 19);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Alessandro"));

        System.out.println(agenda.atualizarNumeroContato("Italo", 90));

    }
}
