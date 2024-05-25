import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoa(List<Pessoa> listaPessoas) {
        this.pessoasList = listaPessoas;

    }

    public void adicionarPessoa(String nome, int idade, Double altura){
        pessoasList.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdadeList = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdadeList);
        return  pessoasPorIdadeList;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura =  new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorAlturaPessoa());
        return pessoasPorAltura;
    }


}
