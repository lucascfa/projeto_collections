package set;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        convidadosSet = new HashSet<>();
    }

    public void addConvidadoSet(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome,codigoConvite));
    }
    public void deletarPorCodigo (int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadosSet){
            if(c.getCodigo() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }
    public void contarConvidados(){
        System.out.println(convidadosSet.size());
    }

    public void exibirConvidados(){
        Convidado convidado = null;
        for(Convidado c : convidadosSet){
            System.out.println(c);
        }

    }
}
