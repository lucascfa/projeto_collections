import Agenda.AgendaContatos;
import Ordenacao.OrdenacaoPessoa;
import Ordenacao.Pessoa;
import Pesquisa.CatalogoLivro;
import Pesquisa.Livro;
import set.ConjuntoConvidados;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();

        agenda.adicionarContato("Lucas",131241234);
        agenda.adicionarContato("Lucas",1023234);
        agenda.adicionarContato("Caylin",1312134);
        agenda.adicionarContato("Camila",9883321);
        agenda.adicionarContato("Maria",1003412);
        agenda.adicionarContato("Jose",2343412);

        agenda.exibirContatos();

        System.out.println("------------------------------------------");
        System.out.println(agenda.pesquisarPorNome("Ma"));
        System.out.println("------------------------------------------");

        System.out.println(agenda.atualizarNumeroContato("Caylin", 97422268));
        System.out.println("------------------------------------------");
        agenda.exibirContatos();
    }
}