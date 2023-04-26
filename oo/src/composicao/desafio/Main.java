package composicao.desafio;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Mouse", 23.90);
        Produto produto2 = new Produto("Teclado", 199.99);

        Produto produto3 = new Produto("Desodorante", 17.49);
        Produto produto4 = new Produto("Sabão Líquido", 41.19);

        Item item1 = new Item(10, produto1);
        Item item2 = new Item(10, produto2);

        Item item3 = new Item(3, produto3);
        Item item4 = new Item(2, produto4);

        Compra compra1 = new Compra();
        compra1.addItem(item1);
        compra1.addItem(item2);

        ArrayList<Item> listaCompra2 = new ArrayList<>() {{
            add(item3);
            add(item4);
        }};

        Compra compra2 = new Compra(listaCompra2);

        Cliente cliente1 = new Cliente("Ivan");
        cliente1.addCompra(compra1);
        cliente1.addCompra(compra2);

        System.out.println(cliente1.finalizarCompra());


    }
}
