package Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeContato {
    private Map<String, Integer> agendaDeContatoMap;

    public AgendaDeContato() {
        agendaDeContatoMap = new HashMap<>();
    }

    public void adidicionarContato(String nome, Integer telefone){
        agendaDeContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaDeContatoMap.isEmpty()){
            agendaDeContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaDeContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaDeContatoMap.isEmpty()){
            numeroPorNome = agendaDeContatoMap.get(nome);
        }
        return numeroPorNome;
    }
}
