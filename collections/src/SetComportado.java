import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetComportado {

    public static void main(String[] args) {

        SortedSet<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucas");
        listaAprovados.add("Pedro");
        listaAprovados.add("Maria");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }

        System.out.println();

        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);
        nums.add(-9);

        for(int n: nums) {
            System.out.println(n);
        }
    }
}
