package Map;

import Produtos.Produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, Produto produto){
        estoqueProdutos.put(codigo, produto);
    }

    public void exibirProdutos(){
         System.out.println(estoqueProdutos);
    }

    public double calcularValorTotal(){
        double totalEstoque = 0d;
        if(!estoqueProdutos.isEmpty()){
            for(Produto p : estoqueProdutos.values()){
                totalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return totalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto p = null;
        double maiorValor = Double.MIN_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for(Produto produto : estoqueProdutos.values()){
                if(produto.getPreco() > maiorValor){
                   p = produto;
                }
            }
        }

        return p;
    }



}
