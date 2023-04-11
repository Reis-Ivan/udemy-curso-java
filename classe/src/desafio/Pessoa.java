package desafio;

public class Pessoa {

    String nome;
    double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
        }
    }

    String apresentar() {
        return "Olá eu sou o " + nome + " e tenho " + peso + " Kgs.";
    }
}
