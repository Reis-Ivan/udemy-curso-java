package composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;
    final List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void addCompra(Compra compra) {
        this.compras.add(compra);
    }

    public double valorTotal() {
        double soma = 0;

        for (Compra compra : this.compras) {
            soma += compra.valorTotalCompra();
        }
        return soma;
    }

    public String finalizarCompra() {
        return String.format(
                "Cliente: %s\n" + "Valor total: R$ %.2f", this.nome, valorTotal());
    }
}
