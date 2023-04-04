package exercicios;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero;
        double soma = 0;

        do {
            numero = sc.nextDouble();
            if (numero >= 0) {
                soma += numero;
            }
            System.out.println(soma);
        } while (numero >= 0);

        sc.close();
    }
}
