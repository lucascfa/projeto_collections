
import Produtos.CadastroProdutos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Produto 5", 1.20, 50);
        cadastroProdutos.adicionarProduto(2L, "Produto 2", 5.20, 100);
        cadastroProdutos.adicionarProduto(3L, "Produto 3", 3.20, 20);
        cadastroProdutos.adicionarProduto(3L, "Produto 4", 1.60, 50);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println("-----------------------------");

        System.out.println(cadastroProdutos.exibirProdutosPorpreco());

        System.out.println("-----------------------------");

        System.out.println(cadastroProdutos.exibirProdutosPorQuantidade());

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    }
}