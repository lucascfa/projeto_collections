package Agenda;

import set.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatosSet);
    }
    public Set pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatosSet){
            if(c.getNome().startsWith(nome)){
               contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
       for(Contato c: contatosSet){
           if(c.getNome().equalsIgnoreCase(nome)){
               c.setNome(nome);
               c.setNumero(numero);
               contatoAtualizado = c;
               break;
           }
       }
       return contatoAtualizado;
    }
}
