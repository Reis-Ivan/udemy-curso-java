package br.edu.ivanDev.campoMinado.modelo;

import br.edu.ivanDev.campoMinado.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private final int linha;
    private final int coluna;

    private boolean aberto = false;
    private boolean minado = false;
    private boolean marcado = false;

    private List<Campo> vizinhos = new ArrayList<>();

    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    boolean adicionarVizinho(Campo candidatoVizinho) {
        boolean linhaDiferente = this.linha != candidatoVizinho.linha;
        boolean colunaDiferente = this.coluna != candidatoVizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinha = Math.abs(this.linha - candidatoVizinho.linha);
        int deltaColuna = Math.abs(this.coluna - candidatoVizinho.coluna);
        int deltaGeral = deltaColuna + deltaLinha;

        boolean caso1 = deltaGeral == 1 && !diagonal;
        boolean caso2 = deltaGeral == 2 && diagonal;

        if (caso1 || caso2) {
            vizinhos.add(candidatoVizinho);
            return true;
        } else {
            return false;
        }
    }

    void alternarMarcacao() {
        if (!aberto) {
            marcado = !marcado;
        }
    }

    boolean abrir() {

        if (!aberto && !marcado) {
            aberto = true;

            if (minado) {
                throw new ExplosaoException();

            }

            if (vizinhancaSegura()) {
                vizinhos.forEach(v -> v.abrir());
            }

            return true;

        } else {
            return false;
        }
    }

    void minar() {
        this.minado = true;
    }

    boolean vizinhancaSegura() {
        return vizinhos.stream().noneMatch(v -> v.minado);
    }

    public boolean isMarcado() {
        return this.marcado;
    }

    void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public boolean isFechado() {
        return !isAberto();
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public boolean isMinado() {
        return minado;
    }

    boolean objetivoAlcancado() {
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;
        return desvendado || protegido;
    }

    long minasNaVizinhanca() {
        return vizinhos.stream()
                .filter(v -> v.minado)
                .count();
    }

    void reiniciar() {
        this.aberto = false;
        this.minado = false;
        this.marcado = false;
    }

    @Override
    public String toString() {
        if (marcado) {
            return "x";
        } else if (aberto && minado) {
            return "*";
        } else if (aberto && minasNaVizinhanca() > 0) {
            return Long.toString(minasNaVizinhanca());
        } else if (aberto) {
            return " ";
        } else {
            return "?";
        }
    }
}
