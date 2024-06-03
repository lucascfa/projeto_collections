package Map.AgendaEventos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEvento {
    private Map<LocalDate, Evento> agendaEvento;

    public AgendaEvento() {
        this.agendaEvento = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEvento.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> agendaOrdenadaPorData = new TreeMap<>(agendaEvento);
        System.out.println(agendaOrdenadaPorData);

    }
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosPorData = new TreeMap<>(agendaEvento);
        for(Map.Entry<LocalDate, Evento> entry : eventosPorData.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("Próximo evento será " + entry.getValue() + " na data " + entry.getKey());
                break;
            }
        }
    }

}
