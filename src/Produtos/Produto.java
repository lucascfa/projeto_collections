package Produtos;

import java.util.Objects;
import java.util.Set;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;
    private int quantidade;
    private long codigo;

    public Produto(String nome, double preco, int quantidade, long codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome = '" + nome + '\'' +
                ", preco = " + preco +
                ", quantidade = " + quantidade +
                ", codigo = " + codigo +
                '}';
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}
