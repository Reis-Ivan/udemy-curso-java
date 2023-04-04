package exercicios;

public class NumeroPrimo {

    public static boolean isPrimo(int numero) {

        int count = 0;
        boolean primo = true;

        for (int i = 2; i <= numero; i++) {

            if (numero % i == 0) {
                count++;

                if (count > 2) {
                    primo = false;
                    break;
                }
            }
        }

        return primo;
    }

    public static void main(String[] args) {

        int numero = 2;
        System.out.printf("%d é primo = %b\n", numero, isPrimo(numero));

        numero = 3;
        System.out.printf("%d é primo = %b\n", numero, isPrimo(numero));

        numero = 10;
        System.out.printf("%d é primo = %b\n", numero, isPrimo(numero));

        numero = 13;
        System.out.printf("%d é primo = %b\n", numero, isPrimo(numero));

        numero = 16;
        System.out.printf("%d é primo = %b\n", numero, isPrimo(numero));
    }

}
