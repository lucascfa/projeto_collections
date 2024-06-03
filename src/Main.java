
import Map.AgendaDeContato;
import Map.EstoqueProdutos;
import Produtos.CadastroProdutos;
import Produtos.Produto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto p1 =  new Produto("Produto 1", 23.90, 200, 1111);
        Produto p2 =  new Produto("Produto 2", 11.90, 50, 1112);
        Produto p3 =  new Produto("Produto 3", 15.90, 120, 1113);
        Produto p4 =  new Produto("Produto 4", 32.90, 21, 1114);
        Produto p5 =  new Produto("Produto 5", 50.90, 43, 1115);

        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1111L, p1);
        estoque.adicionarProduto(1112L, p2);
        estoque.adicionarProduto(1113L, p3);
        estoque.adicionarProduto(1114L, p4);
        estoque.adicionarProduto(1115L, p5);

        estoque.exibirProdutos();

        System.out.println(estoque.calcularValorTotal());

        System.out.println(estoque.obterProdutoMaisCaro());



    }
}