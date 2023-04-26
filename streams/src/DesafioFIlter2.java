import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFIlter2 {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>(){{
            add(new Produto("Tênis", 0.30, true));
            add(new Produto("Laptop", 0.50, true));
            add(new Produto("Livro", 0.60, true));
            add(new Produto("Calça", 0.15, false));
            add(new Produto("Relógio", 0.10, false));
            add(new Produto("Headphone", 0.05, true));
            add(new Produto("Perfume", 0.40, false));
            add(new Produto("Mochila", 0.42, true));
            add(new Produto("Brincos", 0.2, false));
            add(new Produto("Anel", 0.80, true));
        }};

        Predicate<Produto> isPromocao = produto -> produto.getDesconto() >= 0.40;
        Predicate<Produto> isFreteFree = Produto::isFreteGratis;
        Function<Produto, String> listaProdutos = produto -> {
            return String.format("%s está com %.2f de desconto e frete grátis.", produto.getNome(), produto.getDesconto());
        };

        produtos.stream()
                .filter(isPromocao)
                .filter(isFreteFree)
                .map(listaProdutos)
                .forEach(System.out::println);

    }
}
