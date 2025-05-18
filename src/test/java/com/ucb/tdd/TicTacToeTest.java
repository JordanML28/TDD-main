package com.ucb.tdd;

import org.junit.Test;

public class TicTacToeTest {
    
    @Test(expected = RuntimeException.class)
    public void cuandoPiezaFueraDelEjeX_lanzarExcepcion() {
        // 1. Preparación
        TicTacToe juego = new TicTacToe();

        // 2. Lógica
        juego.placePiece(3, 0, 'X'); // posición inválida en X

        // 3. Verificación (automática por expected = RuntimeException)
    }

    @Test(expected = RuntimeException.class)
    public void cuandoPiezaFueraDelEjeY_lanzarExcepcion() {
        // 1. Preparación
        TicTacToe juego = new TicTacToe();

        // 2. Lógica
        juego.placePiece(0, 3, 'X'); // posición inválida en Y

        // 3. Verificación (automática)
    }

    @Test(expected = RuntimeException.class)
    public void cuandoPiezaEnLugarOcupado_lanzarExcepcion() {
        // 1. Preparación
        TicTacToe juego = new TicTacToe();

        // 2. Lógica
        juego.placePiece(0, 0, 'X');
        juego.placePiece(0, 0, '+'); // ya está ocupado

        // 3. Verificación (automática)
    }
    // Pruebas Requerimiento 2:
    // Jordan
    @Test
    public void primerTurnoDebeSerX() {
        // 1. Preparación
        TicTacToe game = new TicTacToe();
        // 2. Lógica
        char jugador = game.getJugadorActual();
        // 3. Verificación
        assertEquals('X', jugador);
    }

     // Jackeline
    @Test
    public void siUltimoTurnoFueX_siguienteDebeSerMas() {
        // 1. Preparación
        TicTacToe game = new TicTacToe();
        // 2. Lógica
        game.placePiece(0, 0, game.getJugadorActual()); // X
        char jugador = game.getJugadorActual();
        // 3. Verificación
        assertEquals('+', jugador);
    }

}
