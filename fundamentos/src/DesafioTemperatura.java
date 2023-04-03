public class DesafioTemperatura {

    public static void main(String[] args) {
        // (ºF - 32) * 5/9 = ºC

        final int C1 = 32;
        final double C2 = 5.0 / 9.0;

        double temperaturaF = 86;
        double temperaturaC = (temperaturaF - C1) * C2;
        System.out.println(temperaturaF + " ºF" + " = " + temperaturaC + " ºC");

        temperaturaF = 150;
        temperaturaC = (temperaturaF - C1) * C2;
        System.out.println(temperaturaF + " ºF" + " = " + temperaturaC + " ºC");

    }
}
