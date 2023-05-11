import personalizadaA.Aluno;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;
        Aluno a2 = new Aluno("Ivinaldson", 10);

        try {
            imprimirNomeAluno(a2);
            imprimirNomeAluno(a1);
        } catch (Exception e) {
            System.out.println("Erro ao imprimir o nome do aluno.");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Fim :)");
    }

    public static void imprimirNomeAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
