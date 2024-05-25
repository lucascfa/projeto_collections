import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

    private List<Livro> catalogo;

    public CatalogoLivro() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        catalogo.add(new Livro(livro.getNome(),livro.getAno(), livro.getAutor()));
    }

    public List<Livro> pesquisarPorAutor(String nomeAutor){
        List<Livro> livrosPorAutor =  new ArrayList<>();
        if(!catalogo.isEmpty()){
            for (Livro l : catalogo){
                if(l.getAutor().equalsIgnoreCase(nomeAutor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorintervaloAno(int datainicio, int dataFim){
        List<Livro> livrosPorAno = new ArrayList<>();

        if(!catalogo.isEmpty()){
            for(Livro l : catalogo){
                if(l.getAno() >= datainicio && l.getAno() <= dataFim){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }
    public Livro pesquisarPorTitulo( String titulo){
        Livro livroPorTitulo = null;
        if(!catalogo.isEmpty()){
            for(Livro l : catalogo){
                if(l.getNome().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                }
            }
        }
        return livroPorTitulo;
    }
}
