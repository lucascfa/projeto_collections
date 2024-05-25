//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas =  new ListaTarefas();


        System.out.println("Quantidade de tarefas: " + listaTarefas.obterNumeroTotalTarefas());


        listaTarefas.adicionarTarefa("Comprar um tenis");
        listaTarefas.adicionarTarefa("Comprar uma blusa");
        listaTarefas.adicionarTarefa("Comprar uma blusa");

        listaTarefas.obterNumeroTotalTarefas();
        System.out.println("Quantidade de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Comprar uma blusa");


        System.out.println("Quantidade de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricaoTarefas();

        listaTarefas.obterDescricaoTarefas();


    }
}