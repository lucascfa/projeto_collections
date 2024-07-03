
import Map.AgendaDeContato;
import Map.AgendaEventos.AgendaEvento;
import Map.EstoqueProdutos;
import Produtos.CadastroProdutos;
import Produtos.Produto;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgendaEvento agenda = new AgendaEvento();
        agenda.adicionarEvento(LocalDate.of(2024, Month.JUNE,01),"Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2024, Month.JULY,24),"Evento 2", "Atração 2");
        agenda.adicionarEvento(LocalDate.of(2024, Month.JUNE,26),"Evento 3", "Atração 3");
        agenda.adicionarEvento(LocalDate.of(2024, Month.FEBRUARY,10),"Evento 4", "Atração 4");
        agenda.adicionarEvento(LocalDate.of(2024, Month.OCTOBER,10),"Evento 5", "Atração 5");

        agenda.exibirAgenda();

        agenda.obterProximoEvento();

        Optional<String> valorOpcional = Optional.ofNullable("Lucas");
        String palavra =  valorOpcional.orElse("Deu ruim.");
        System.out.println(palavra);

        ArrayList<String> lista_nomes = new ArrayList<>();
        lista_nomes.add("Lucas");
        lista_nomes.add("Lucas 2");
        lista_nomes.add("CAylin");
        lista_nomes.add("Teste");

        lista_nomes.stream().forEach(nome -> {
            String nome_atualizado = nome.concat(" concatenado");
            System.out.println(nome_atualizado);
        });


    }
}