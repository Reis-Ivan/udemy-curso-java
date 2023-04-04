package exercicios;

import java.util.Scanner;

public class LetraPorLetra {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }

        sc.close();
    }


}
