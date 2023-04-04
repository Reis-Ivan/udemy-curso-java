package exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int numero = rnd.nextInt(101);
        int tentativas = 10;
        int chute = 0;
        boolean acertou = false;

        for (int i = tentativas; i > 0; i--) {
            System.out.print("Dê um chute: ");
            chute = sc.nextInt();

            if (chute > numero) {
                System.out.println("O número é menor!");
                System.out.println("Tentativas restantes: " + (i - 1));
            }

            if (chute < numero) {
                System.out.println("O número é maior!");
                System.out.println("Tentativas: " + (i - 1));
            }

            if (chute == numero) {
                acertou = true;
                break;
            }
            System.out.println();
        }

        if (acertou) {
            System.out.printf("Você acertou! Seu chute de %d é igual a %d gerado!", chute, numero);
        } else {
            System.out.println("Você errou! O número gerado foi " + numero + ".");
        }


        sc.close();

    }

}
