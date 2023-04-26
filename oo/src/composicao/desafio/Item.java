package composicao.desafio;

public class Item {

    final int quantidade;
    final Produto produto;

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public double valorTotalItem() {
        return quantidade * produto.preco;
    }
}
