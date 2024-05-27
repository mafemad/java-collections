package list.carrinho;

public class Item {
    private String nome;
    private double valor;
    private int quantiadade;

    public Item() {
    }

    public Item(String nome, double valor, int quantiadade) {
        this.nome = nome;
        this.valor = valor;
        this.quantiadade = quantiadade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantiadade() {
        return quantiadade;
    }

    public void setQuantiadade(int quantiadade) {
        this.quantiadade = quantiadade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", quantiadade=" + quantiadade +
                '}';
    }
}
