package heranca.teste;

import heranca.desafio.Ferrari;
import heranca.desafio.Fusca;

public class CarroMain {
    public static void main(String[] args) {

        Fusca fusca = new Fusca(100);
        Ferrari ferrari = new Ferrari(400);

        fusca.acelerar();
        System.out.println("Fusca   - " + fusca.exibirVelocidade());
        fusca.frear();
        System.out.println("Fusca   - " + fusca.exibirVelocidade());
        fusca.acelerar();
        System.out.println("Fusca   - " + fusca.exibirVelocidade());
        fusca.frear();
        System.out.println("Fusca   - " + fusca.exibirVelocidade());
        fusca.frear();

        ferrari.acelerar();
        ferrari.ligarTurbo();
        ferrari.ligarAr();
        System.out.println(ferrari.velocidadeDoAr());
        System.out.println("Ferrari - " + ferrari.exibirVelocidade());
        ferrari.frear();
        System.out.println("Ferrari - " + ferrari.exibirVelocidade());
        ferrari.acelerar();
        System.out.println("Ferrari - " + ferrari.exibirVelocidade());
        ferrari.acelerar();
        System.out.println("Ferrari - " + ferrari.exibirVelocidade());


    }

}
