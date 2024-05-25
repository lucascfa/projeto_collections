import java.awt.*;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ListaTarefas listaTarefas =  new ListaTarefas();
//        System.out.println("Quantidade de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
//        listaTarefas.adicionarTarefa("Comprar um tenis");//        listaTarefas.adicionarTarefa("Comprar uma blusa");
//        listaTarefas.adicionarTarefa("Comprar uma blusa");
//        listaTarefas.obterNumeroTotalTarefas();
//        System.out.println("Quantidade de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
//        listaTarefas.removerTarefa("Comprar uma blusa");
//        System.out.println("Quantidade de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
//        listaTarefas.obterDescricaoTarefas();//        listaTarefas.obterDescricaoTarefas();


        // Pesquisa em lists
        CatalogoLivro catalogo =  new CatalogoLivro();

        // Base de livros para estudo
        Livro livro1 = new Livro("Livro 1", 2023,"Lucas");        Livro livro2 = new Livro("Livro 1", 2021,"Karina");
        Livro livro3 = new Livro("Livro 2", 2023,"Denilson");        Livro livro4 = new Livro("Livro 4", 2024,"Lucas");
        Livro livro5 = new Livro("Livro 1", 2019,"Lucas");        Livro livro6 = new Livro("Livro 4", 2002,"Caylin");
        Livro livro7 = new Livro("Livro 1", 2018,"Lucas");        Livro livro8 = new Livro("Livro 5", 2010,"Jose");
        // Adicionar livros ao catologo

        catalogo.adicionarLivro(livro1);catalogo.adicionarLivro(livro2);catalogo.adicionarLivro(livro3);catalogo.adicionarLivro(livro4);
        catalogo.adicionarLivro(livro5);catalogo.adicionarLivro(livro6);catalogo.adicionarLivro(livro7);catalogo.adicionarLivro(livro8);

        // Pesquisar por Autor;
        //System.out.println("Livros pesquisados por autor " + livro3.getAutor() + ": " + catalogo.pesquisarPorAutor(livro3.getAutor()));
        //System.out.println("Livros pesquisados por ano 2020 a 2024: " + catalogo.pesquisarPorintervaloAno(2020,2024));
        //System.out.println("Livros pesquisados por título: " + catalogo.pesquisarPorTitulo("Livro 1"));

        // aula de ordenação utilizando comparator e comparable
        Pessoa p1 = new Pessoa("Lucas", 29, 1.82);        Pessoa p2 = new Pessoa("Denilson", 31, 1.78);
        Pessoa p3 = new Pessoa("Ernilson", 33, 1.76);        Pessoa p4 = new Pessoa("Caylin", 27, 1.55);
        Pessoa p5 = new Pessoa("Cleide", 32, 1.60);        Pessoa p6 = new Pessoa("Francisca", 50, 1.50);

        List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
        listaDePessoas.add(p1);        listaDePessoas.add(p2);        listaDePessoas.add(p3);
        listaDePessoas.add(p4);        listaDePessoas.add(p5);        listaDePessoas.add(p6);

        OrdenacaoPessoa ordenacaoPessoa =  new OrdenacaoPessoa(listaDePessoas);

        //System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

    }
}