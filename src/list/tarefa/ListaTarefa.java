package list.tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> lista;

    public ListaTarefa() {
        this.lista = new ArrayList<>();
    }

    public void addTarefa(String desc){
        lista.add(new Tarefa(desc));
    }

    public void removerTarefa(String desc){
        lista.removeIf(x -> x.getDescricao() == desc);
    }

    public int obterTotalTarefas(){
        return lista.size();
    }

    public void obterDescricoes(){
        System.out.println(lista);
    }
    @Override
    public String toString() {
        return "ListaTarefa{" +
                "lista=" + lista +
                '}';
    }
}
