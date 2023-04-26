import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Ímpar";

        Function<String, String> oResultadoE = vlr -> "O resultado é: " + vlr;

        Function<String, String> empolgado = vlr -> vlr + "!!!!";

        Function<String, String> duvida = vlr -> vlr + "???";

        String resultadoFinal1 = parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(32);

        String resultadoFinal2 = parOuImpar
                .andThen(oResultadoE)
                .andThen(duvida)
                .apply(32);

        System.out.println(parOuImpar.apply(32));
        System.out.println(resultadoFinal1);
        System.out.println(resultadoFinal2);

    }
}
