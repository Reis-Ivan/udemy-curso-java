import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Ana"); // lança exceção
        fila.offer("Bia"); // retorna boolean
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança exceção
        System.out.println(fila.element());


        System.out.println(fila.poll()); // remove
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains(...);
    }
}
