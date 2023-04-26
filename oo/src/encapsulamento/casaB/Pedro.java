package encapsulamento.casaB;

import encapsulamento.casaA.Ana;

public class Pedro extends Ana {


    void testeAcessos() {
        Ana mae = new Ana();

        // System.out.println(mae.segredo);
        // System.out.println(mae.facoDentroDeCasa);
        System.out.println(formaDeFalar); // Acessar somente via herança
        System.out.println(todosSabem);
        System.out.println(mae.todosSabem);

    }

}
