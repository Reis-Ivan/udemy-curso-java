/*
 * 1. Criar duas funções lambdas (filter)
 * 2. Utilizar map
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFIlter {

    public static void main(String[] args) {

        List<Franquia> times = new ArrayList<>() {{
            add(new Franquia("Golden State Warriors", "oeste", true));
            add(new Franquia("Sacramento Kings", "oeste", false));
            add(new Franquia("Los Angeles Lakers", "oeste", true));
            add(new Franquia("Charlotte Hornets", "leste", false));
            add(new Franquia("Milwaukee Bucks", "leste", true));
            add(new Franquia("Orlando Magic", "leste", false));
        }};

        Predicate<Franquia> isOeste = time -> time.getConferencia().equalsIgnoreCase("oeste");
        Predicate<Franquia> isLeste = time -> time.getConferencia().equalsIgnoreCase("leste");
        Predicate<Franquia> isCampeao = Franquia::isCampeao;
        Function<Franquia, String> campeaoOeste = Franquia::getNome;


        System.out.println("Times campeões do OESTE: ");
        times.stream()
                .filter(isOeste)
                .filter(isCampeao)
                .map(campeaoOeste)
                .forEach(System.out::println);

        System.out.println("\n\nTimes campeões do LESTE: ");
        times.stream()
                .filter(isLeste)
                .filter(isCampeao)
                .map(campeaoOeste)
                .forEach(System.out::println);

    }
}
