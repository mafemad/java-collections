package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoas;


    public OrdenacaoPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade,altura));
    }

    public List<Pessoa> pessoasPorIdade(){
        List<Pessoa> ordenada = new ArrayList<>(pessoas);
        Collections.sort(ordenada);
        return ordenada;
    }
    public List<Pessoa> pessoasPorAltura(){
        List<Pessoa> ordenada = new ArrayList<>(pessoas);
        Collections.sort(ordenada, new ComparatorAltura());
        return ordenada;
    }


    public static void main(String[] args) {
        OrdenacaoPessoa ordem = new OrdenacaoPessoa();
        ordem.adicionarPessoa("pessoa 1", 19, 1.95);
        ordem.adicionarPessoa("pessoa 2", 34, 1.73);
        ordem.adicionarPessoa("pessoa 3", 46, 1.93);
        ordem.adicionarPessoa("pessoa 4", 7, 1.67);
        ordem.adicionarPessoa("pessoa 5", 12, 1.83);
        System.out.println(ordem);
        System.out.println(ordem.pessoasPorAltura());
        System.out.println(ordem.pessoasPorIdade());

    }

}
