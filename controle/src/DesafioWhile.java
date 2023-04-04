import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota = 0;
        double soma = 0;
        int count = 0;

        while (nota != -1) {
            System.out.print("Informe a nota: ");
            nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                count++;
            }
        }

        double media = soma / count;

        System.out.printf("A média das notas é: %.2f", media);

        sc.close();

    }
}
