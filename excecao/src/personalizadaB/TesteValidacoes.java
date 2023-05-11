package personalizadaB;

public class TesteValidacoes {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Ana", 7);
            Validar.aluno(aluno);
            Validar.aluno(null);
        } catch (StringVaziaException | NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Validar.aluno(null);
        } catch (StringVaziaException e) {
            throw new RuntimeException(e);
        } catch (NumeroForaIntervaloException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fim!");

    }
}
