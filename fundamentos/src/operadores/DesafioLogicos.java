package operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        // Trabalho terça (V ou F)
        // Trabalho quinta (V ou F)

        boolean trabalho1 = false;
        boolean trabalho2 = true;

        boolean tv50 = trabalho1 && trabalho2;
        boolean tv32 = trabalho1 ^ trabalho2;
        boolean sorvete = tv50 || tv32;
        boolean saudavel = !sorvete;

        System.out.println("TV 50: " + tv50);
        System.out.println("TV 32: " + tv32);
        System.out.println("Sorvete: " + sorvete);
        System.out.println("Saudável: " + saudavel);

    }

}
