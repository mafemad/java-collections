package tarefa;

public class main {
    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();
        lista.addTarefa("abacate");
        lista.addTarefa("abacate");
        lista.addTarefa("42");
        lista.obterDescricoes();
        lista.removerTarefa("abacate");
        lista.obterDescricoes();

    }
}
