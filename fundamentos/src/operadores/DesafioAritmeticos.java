package operadores;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        double exp1 = 3 + 2;
        double exp2 = exp1 * 6;
        double exp3 = Math.pow(exp2, 2);
        double exp4 = 3 * 2;
        double exp5 = exp3 / exp4;

        double exp6 = (double) ((1 - 5) * (2 - 7)) / 2;
        double exp7 = Math.pow(exp6, 2);

        double exp8 = exp5 - exp7;
        double exp9 = Math.pow(exp8, 3);
        double exp10 = Math.pow(10, 3);

        double exp11 = exp9 / exp10;

        System.out.println(exp11);


    }
}
