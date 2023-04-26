package composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    public Compra() {
    }

    public Compra(List<Item> itens) {
        this.itens = itens;
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }

    public double valorTotalCompra() {
        double total = 0;
        for (Item item : itens) {
            total += item.valorTotalItem();
        }

        return total;
    }
}
