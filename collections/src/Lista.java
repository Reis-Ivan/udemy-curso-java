import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manoela"));

        System.out.println(lista.get(3)); // acessar pelo índice

        lista.remove(1); // remove "Carlos"
        lista.remove(new Usuario("Manoela"));

        System.out.println("Tem? " + lista.contains(new Usuario("Bia")));

        for(Usuario u: lista) {
            System.out.println(u.nome);
        }
    }
}
