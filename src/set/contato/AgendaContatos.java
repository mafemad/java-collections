package set.contato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(numero, nome));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosNome.add(c);
            }
        }
        return contatosNome;
    }
    public Contato atualizarContato(String nome, int novoNumero){
        Contato atualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                atualizado = c;
                break;
            }
        }
        return atualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.exibirContatos();

        agenda.adicionarContato("mateus", 1234);
        agenda.adicionarContato("mateus 1", 12345);
        agenda.adicionarContato("mafemad", 123467);
        agenda.adicionarContato("mateus 3", 1234);
        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("mateus"));
        agenda.atualizarContato("mateus", 23451);
        agenda.exibirContatos();

    }
}
