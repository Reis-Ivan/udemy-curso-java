package br.edu.ivanDev.campoMinado;

import br.edu.ivanDev.campoMinado.modelo.Tabuleiro;
import br.edu.ivanDev.campoMinado.visao.TabuleiroConsole;

public class App {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);
    }
}
