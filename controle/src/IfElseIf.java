import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");

        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
        } else if (nota >= 9.0) {
            System.out.println("Conceito A");
        } else if (nota >= 7.5) {
            System.out.println("Conceito B");
        } else if (nota >= 6.0) {
            System.out.println("Conceito C");
        } else if (nota >= 5.0) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Reprovado!");
        }

        System.out.println("Fim!");
        entrada.close();

    }
}
