package list.carrinho;

public class main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.addItem("abacate", 5, 2);
        carrinho.addItem("abacate", 10, 6);
        carrinho.addItem("banana", 3, 4);
        carrinho.addItem("maca", 1, 5);
        double total = carrinho.calcularValortotal();
        System.out.println(total);
        carrinho.exibirItens();
        carrinho.removerItem("abacate");
        carrinho.exibirItens();
    }
}
