import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
 * 1. Número para string binária... 6 => "110"
 * 2. Inverter a string... "110" => "011"
 * 3. Converter de volta para inteiro => "011" => 3
 */

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("String binária: ");
        nums.stream()
                .map(Integer::toBinaryString)
                .forEach(System.out::println);

        UnaryOperator<String> inverter = (s) -> new StringBuilder(s).reverse().toString();

        System.out.println("\n\nInverter a string:");
        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .forEach(System.out::println);

        Function<String, Integer> binaryToString = (element) -> Integer.parseInt(element, 2);

        System.out.println("\n\nConvertar novamente:");
        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binaryToString)
                .forEach(System.out::println);

    }
}