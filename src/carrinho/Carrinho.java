package carrinho;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> lista;

    public Carrinho (){
        this.lista = new ArrayList<>();
    }

    public void addItem(String desc, double valor, int quantidade){
        lista.add(new Item(desc,valor,quantidade));
    }

    public void removerItem(String nome){
        lista.removeIf(x -> x.getNome() == nome);
    }

    public double calcularValortotal(){
        double total = 0;
        for(Item i : lista){
            total += i.getValor() * i.getQuantiadade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(lista);
    }
}
