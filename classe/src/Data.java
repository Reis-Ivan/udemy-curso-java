public class Data {

    int dia;
    int mes;
    int ano;

    public Data() {
//        this.dia = 1;
//        this.mes = 1;
//        this.ano = 1970;
        this(1, 1, 1970);
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        final String formato = "%s/%s/%s";
        return String.format(formato, zeroNoInicio(dia), zeroNoInicio(mes), zeroNoInicio(ano));
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }

    String zeroNoInicio(int valor) {
        return (valor < 10) ? ("0" + valor) : ((Integer) valor).toString();
    }

}
