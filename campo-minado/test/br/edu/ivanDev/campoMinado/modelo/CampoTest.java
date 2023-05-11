package br.edu.ivanDev.campoMinado.modelo;

import br.edu.ivanDev.campoMinado.excecao.ExplosaoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CampoTest {

    private Campo campo;

    @BeforeEach
    void iniciarCampo() {
        campo = new Campo(3, 3);
    }

    @Test
    void testeLinha() {
        assertEquals(3, campo.getLinha());
    }

    @Test
    void testeColuna() {
        assertEquals(3, campo.getColuna());
    }

    @Test
    void testeReiniciar() {
        campo.reiniciar();
        boolean estadoInicial = campo.isAberto() && campo.isMarcado() && campo.isMinado();
        assertFalse(estadoInicial);
    }

    @Test
    void testeVizinhoDistancia1Esquerda() {
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1Direita() {
        Campo vizinho = new Campo(3, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoDistancia1Cima() {
        Campo vizinho = new Campo(2, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1Baixo() {
        Campo vizinho = new Campo(4, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1Diagonal() {
        Campo vizinho = new Campo(2, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeNaoVizinho() {
        Campo vizinho = new Campo(1, 1);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertFalse(resultado);
    }

    @Test
    void testeValorPadraoAtributoMarcado() {
        assertFalse(campo.isMarcado());
    }

    @Test
    void testeAlternarMarcacao() {
        campo.alternarMarcacao();
        assertTrue(campo.isMarcado());
    }

    @Test
    void testeAlternarMarcacaoDuasChamadas() {
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        assertFalse(campo.isMarcado());
    }

    @Test
    void testeAbrirNaoMinadoNaoMarcado() {
        assertTrue(campo.abrir());
    }

    @Test
    void testeAbrirNaoMinadoMarcado() {
        campo.alternarMarcacao();
        assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirMinadoMarcado() {
        campo.alternarMarcacao();
        campo.minar();
        assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirMinadoNaoMarcado() {
        campo.minar();

        assertThrows(ExplosaoException.class, () -> {
            campo.abrir();
        });
    }

    @Test
    void testeAbrirComVizinhos1() {

        Campo campo11 = new Campo(1, 1);
        Campo campo22 = new Campo(2, 2);

        campo22.adicionarVizinho(campo11);
        campo.adicionarVizinho(campo22);

        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isAberto());
    }

    @Test
    void testeAbrirComVizinhos2() {

        Campo campo11 = new Campo(1, 1);
        Campo campo12 = new Campo(1, 2);
        Campo campo22 = new Campo(2, 2);

        campo12.minar();

        campo22.adicionarVizinho(campo11);
        campo22.adicionarVizinho(campo12);
        campo.adicionarVizinho(campo22);

        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isFechado());
    }

    @Test
    void testeAlcancadoDesvendadoSemMina() {
        campo.abrir();
        assertTrue(campo.objetivoAlcancado());
    }

    @Test
    void testeAlcancadoMarcadoComMina() {
        campo.minar();
        campo.alternarMarcacao();
        assertTrue(campo.objetivoAlcancado());
    }

    @Test
    void testeMinasNaVizinhanca() {
        Campo campo11 = new Campo(1, 1);
        Campo campo12 = new Campo(1, 2);
        Campo campo22 = new Campo(2, 2);

        campo11.minar();
        campo.minar();

        campo22.adicionarVizinho(campo11);
        campo22.adicionarVizinho(campo12);
        campo22.adicionarVizinho(campo);

        assertEquals(2, campo22.minasNaVizinhanca());
    }

    @Test
    void testeToStringMarcado() {
        campo.alternarMarcacao();
        assertEquals("x", campo.toString());
    }

    @Test
    void testeToStringMinasVizinhanca() {
        Campo campo22 = new Campo(2, 2);
        Campo campo23 = new Campo(2, 3);
        Campo campo32 = new Campo(3, 2);
        Campo campo42 = new Campo(4, 2);
        Campo campo43 = new Campo(4, 3);

        campo23.minar();
        campo32.minar();
        campo43.minar();

        campo.adicionarVizinho(campo22);
        campo.adicionarVizinho(campo23);
        campo.adicionarVizinho(campo32);
        campo.adicionarVizinho(campo42);
        campo.adicionarVizinho(campo43);

        campo.abrir();

        assertEquals("3", campo.toString());

    }

    @Test
    void testeToStringAbertoSemMina() {
        campo.abrir();
        assertEquals(" ", campo.toString());
    }

    @Test
    void testeToStringFechado() {
        assertEquals("?", campo.toString());
    }

}
