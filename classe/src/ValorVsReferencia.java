public class ValorVsReferencia {

    public static void main(String[] args) {

        double a = 2;
        double b = a; // atribuiçõa por valor (Tipo primitivo)

        a++;
        b--;

        System.out.printf("a = %.2f\n", a);
        System.out.printf("b = %.2f\n", b);
        System.out.println();

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; // atribuição por referência (Objeto)

        d1.dia = 31;
        d2.mes = 12;

        d1.ano = 2025;

        System.out.printf("d1 = %s\n", d1.obterDataFormatada());
        System.out.printf("d2 = %s\n", d2.obterDataFormatada());
        System.out.println();

        voltarDataParaValorPadrao(d1);

        System.out.printf("d1 = %s\n", d1.obterDataFormatada());
        System.out.printf("d2 = %s\n", d2.obterDataFormatada());
        System.out.println();

        int c = 5;
        alterarPrimitivo(c);
        System.out.printf("c = %d", c);

    }

    public static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1070;
    }

    public static void alterarPrimitivo(int valor) {
        valor++;
    }
}
