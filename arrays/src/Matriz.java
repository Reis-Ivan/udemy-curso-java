import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de alunos? ");
        int qtdeAlunos = sc.nextInt();

        System.out.print("Quantidade de notas? ");
        int qtdeNotas = sc.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
        double[] mediaAluno = new double[qtdeAlunos];


        for (int i = 0; i < notasDaTurma.length; i++) {
            double soma = 0;
            System.out.printf("Aluno #%d:\n", (i + 1));
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Informe a nota %d: ", (j + 1));
                notasDaTurma[i][j] = sc.nextDouble();
                soma += notasDaTurma[i][j];
            }
            mediaAluno[i] = soma / qtdeNotas;
            System.out.println();
        }

        double somaTurma = 0;
        for (double media : mediaAluno) {
            somaTurma += media;
        }

        double mediaTurma = somaTurma / qtdeAlunos;
        System.out.printf("Media da turma: %.2f", mediaTurma);


        sc.close();
    }
}
