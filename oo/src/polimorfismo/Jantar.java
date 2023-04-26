package polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediante1 = new Arroz(0.2);
        Feijao ingrediante2 = new Feijao(0.1);



        System.out.println(convidado.getPeso());

        convidado.comer(ingrediante1);
        convidado.comer(ingrediante2);

        System.out.println(convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.5);

        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());
    }
}
