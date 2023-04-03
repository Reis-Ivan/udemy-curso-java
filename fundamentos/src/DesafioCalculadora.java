import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite um número: ");
        double num2 = sc.nextDouble();

        System.out.print("Uma operação: ");
        String op = sc.next();

        double resultado = 0;
        resultado = op.equals("+") ? (num1 + num2) : resultado;
        resultado = op.equals("-") ? (num1 - num2) : resultado;
        resultado = op.equals("*") ? (num1 * num2) : resultado;
        resultado = op.equals("/") ? (num1 / num2) : resultado;
        resultado = op.equals("%") ? (num1 % num2) : resultado;

        System.out.printf("Resultado %.2f %s %.2f = %.2f", num1, op, num2, resultado);

        sc.close();
    }
}
