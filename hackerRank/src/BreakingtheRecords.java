import java.util.ArrayList;
import java.util.List;

public class BreakingtheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {

        int minAux = scores.get(0);
        int maxAux = scores.get(0);

        int minCount = 0;
        int maxCount = 0;

        for (Integer score : scores) {
            if (score > maxAux) {
                maxCount++;
                maxAux = score;
            } else if (score < minAux) {
                minCount++;
                minAux = score;
            }
        }

        int finalMinCount = minCount;
        int finalMaxCount = maxCount;

        return new ArrayList<>() {{
            add(finalMaxCount);
            add(finalMinCount);
        }};
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(10);
        lista1.add(5);
        lista1.add(20);
        lista1.add(20);
        lista1.add(4);
        lista1.add(5);
        lista1.add(2);
        lista1.add(25);
        lista1.add(1);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(3);
        lista2.add(4);
        lista2.add(21);
        lista2.add(36);
        lista2.add(10);
        lista2.add(28);
        lista2.add(35);
        lista2.add(5);
        lista2.add(24);
        lista2.add(42);

        System.out.println("Resultado: " + breakingRecords(lista1));
        System.out.println("Resultado: " + breakingRecords(lista2));
    }
}
