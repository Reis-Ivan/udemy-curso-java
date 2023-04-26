import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Maria"));
        usuarios.add(new Usuario("João"));
        usuarios.add(new Usuario("Eduarda"));

        boolean resultado = usuarios.contains(new Usuario("João"));
        System.out.println(resultado);

    }
}
