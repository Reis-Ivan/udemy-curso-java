import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas notas? ");
        int quantidade = sc.nextInt();

        double[] notas = new double[quantidade];

        System.out.println();

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a nota #%d: ", (i + 1));

            notas[i] = sc.nextDouble();
        }

        for (double nota : notas) {
            soma += nota;
        }

        System.out.println();
        System.out.printf("Média das notas = %.2f", soma / notas.length);

        sc.close();
    }
}
