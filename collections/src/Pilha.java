import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe");
        livros.push("Dom Quixote");
        livros.push("O Hobbit");
        livros.add("Filhos do Éden");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.remove());

        // System.out.println(livros.pop());
        // System.out.println(livros.remove());

        System.out.println(livros.removeFirst());


    }
}
