import java.util.Scanner;

public class SwitchComBreak {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.println("Informe a nota: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 10, 9 -> conceito = "A";
            case 8, 7 -> conceito = "B";
            case 6, 5 -> conceito = "C";
            case 4, 3 -> conceito = "D";
            case 2, 1, 0 -> conceito = "E";
            default -> conceito = "Não encontrado!";
        }

        System.out.println("Seu conceito é " + conceito);
        entrada.close();

    }

}
