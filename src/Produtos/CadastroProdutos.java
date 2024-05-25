package Produtos;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    public Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int qtd){
        produtoSet.add(new Produto(nome, preco, qtd, cod));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosOrganizadosPorNome = new TreeSet<>(produtoSet);
        return produtosOrganizadosPorNome;
    }

    public Set<Produto> exibirProdutosPorpreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
    public Set<Produto> exibirProdutosPorQuantidade(){
        Set<Produto> produtosPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
        produtosPorQuantidade.addAll(produtoSet);
        return produtosPorQuantidade;
    }


}

