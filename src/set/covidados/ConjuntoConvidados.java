package set.covidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        convidadosSet = new HashSet<>();
    }

    public void addConvidado (String nome, int convite){
        convidadosSet.add(new Convidado(nome, convite));
    }

    public void removerConvidadoPorCodigo(int codigo){
        Convidado convidado = null;
        for(Convidado c : convidadosSet){
            if (c.getCodigoConvite() == codigo){
                convidado = c;
                break;
            }
        }
        convidadosSet.remove(convidado);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conj = new ConjuntoConvidados();
        System.out.println(conj.contarConvidados());

        conj.addConvidado("a",1234);
        conj.addConvidado("b",1234);
        conj.addConvidado("c",1235);
        conj.addConvidado("d",1236);

        System.out.println(conj.contarConvidados());
        conj.exibirConvidados();

        conj.removerConvidadoPorCodigo(1234);
        System.out.println(conj.contarConvidados());
        conj.exibirConvidados();

    }
}
