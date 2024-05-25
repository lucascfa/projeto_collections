package Produtos;

import java.util.Comparator;

public class ComparatorPorQuantidade implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Integer.compare(p1.getQuantidade(), p2.getQuantidade());
    }
}
