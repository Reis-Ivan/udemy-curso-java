import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String entrada  = "";

        while (!entrada.equalsIgnoreCase("sair")) {
            System.out.print("Digite um frase: ");
            entrada = sc.nextLine();
            System.out.printf("\n%s\n", entrada);
        }

        sc.close();

    }
}
