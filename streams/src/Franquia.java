public class Franquia {

    private final String nome;
    private final String conferencia;
    private final boolean isCampeao;

    public Franquia(String nome, String conferencia, boolean isCampeao) {
        this.nome = nome;
        this.conferencia = conferencia;
        this.isCampeao = isCampeao;
    }

    public String getNome() {
        return nome;
    }

    public String getConferencia() {
        return conferencia;
    }

    public boolean isCampeao() {
        return isCampeao;
    }
}
