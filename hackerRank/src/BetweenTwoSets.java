import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int aux = 0;

        BiFunction<Integer, List<Integer>, Boolean> isDivisivel = (x, lista) -> {
            for (int numero : lista) {
                if (x % numero != 0) return false;
            }
            return true;
        };

        BiFunction<Integer, List<Integer>, Boolean> isDivisor = (x, lista) -> {
            for (int numero : lista) {
                if (numero % x != 0) return false;
            }
            return true;
        };

        for (int i = 1; i <= 100; i++) {
            if (isDivisivel.apply(i, a) && isDivisor.apply(i, b)) {
                aux++;
            }
        }

        return aux;
    }

    public static void main(String[] args) {

        List<Integer> listaA = Arrays.asList(2, 4);
        List<Integer> listaB = Arrays.asList(16, 32, 96);

        System.out.println(getTotalX(listaA, listaB));

    }
}
