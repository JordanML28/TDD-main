package com.ucb.tdd;

import org.junit.Test;

public class TicTacToeTest {
//Jordan
    @Test(expected = RuntimeException.class)
    public void cuandoPiezaFueraDelEjeX_lanzarExcepcion() {
        // 1. Preparación
        TicTacToe juego = new TicTacToe();

        // 2. Lógica
        juego.placePiece(3, 0, 'X'); // posición inválida en X

        // 3. Verificación (automática por expected = RuntimeException)
    }
}
