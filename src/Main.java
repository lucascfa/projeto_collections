
import Map.AgendaDeContato;
import Produtos.CadastroProdutos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgendaDeContato agenda = new AgendaDeContato();

        agenda.adidicionarContato("Fulano 1", 619832412);
        agenda.adidicionarContato("Fulano 2", 119832412);
        agenda.adidicionarContato("Fulano 3", 329832412);
        agenda.adidicionarContato("Fulano 4", 889832412);
        agenda.adidicionarContato("Fulano 5", 329832412);

        agenda.exibirContatos();
        System.out.println("-------------------------------------------------");

        agenda.removerContato("Fulano 3");

        agenda.exibirContatos();
        System.out.println("-------------------------------------------------");

        System.out.println(agenda.pesquisarPorNome("Fulano 5"));
        System.out.println("-------------------------------------------------");

    }
}