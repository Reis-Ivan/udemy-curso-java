package encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Jousé", "Inácio", 130);
        p1.setIdade(-30);

        System.out.println(p1.getNomeCompleto()); // ler
        System.out.println(p1); // ler

    }
}
