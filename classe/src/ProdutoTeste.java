public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Laptop", 5000);

        var p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 16.00;
        Produto.desconto = 0.50;

        System.out.println(p1.nome + " - " + p1.precoComDesconto());
        System.out.println(p2.nome + " - " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
        System.out.printf("Média do carrinho = R$ %.2f", mediaCarrinho);
    }
}
