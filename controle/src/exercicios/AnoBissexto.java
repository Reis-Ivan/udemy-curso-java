package exercicios;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ano = sc.nextInt();
        boolean bissexto = false;

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    bissexto = true;
                }
            } else {
                bissexto = true;
            }
        }

        if (bissexto) {
            System.out.printf("O %d é bissexto.", ano);
        } else {
            System.out.printf("O %d não bissexto.", ano);

        }

        sc.close();

    }
}
