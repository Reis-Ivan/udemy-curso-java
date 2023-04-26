package heranca.desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual;
    private int delta = 5;

    protected Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }

    public void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= getDelta();
        } else {
            velocidadeAtual = 0;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public String exibirVelocidade() {
        return String.format("Velocidade atual: %d Km/h", this.velocidadeAtual);
    }
}
