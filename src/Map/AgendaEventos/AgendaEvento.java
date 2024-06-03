package Map.AgendaEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AgendaEvento {
    private Map<LocalDate, Evento> agendaEvento;

    public AgendaEvento() {
        this.agendaEvento = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEvento.put(data, new Evento(nome, atracao));
    }

}
