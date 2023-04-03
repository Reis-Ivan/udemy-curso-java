import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro salário: ");
        String salario1 = sc.nextLine().replace(",", ".");

        System.out.print("Segundo salário: ");
        String salario2 = sc.nextLine().replace(",", ".");

        System.out.print("Terceiro salário: ");
        String salario3 = sc.nextLine().replace(",", ".");


        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);

        double media = (valor1 + valor2 + valor3) / 3;

        System.out.printf("Média dos salários: %.2f", media);

        sc.close();
    }
}
