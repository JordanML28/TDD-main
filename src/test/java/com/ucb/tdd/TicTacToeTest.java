package com.ucb.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

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

    // Alex
    @Test
    public void siUltimoTurnoFueMas_siguienteDebeSerX() {
        // 1. Preparación
        TicTacToe game = new TicTacToe();
        // 2. Lógica
        game.placePiece(0, 0, game.getJugadorActual()); // X
        game.placePiece(0, 1, game.getJugadorActual()); // +
        char jugador = game.getJugadorActual();
        // 3. Verificación 
        assertEquals('X', jugador);
    }
    // Pruebas Requerimiento 3:
    //Jordan
    @Test
    public void siNoHayTresEnLinea_noHayGanador() {
        // 1. Preparación
        TicTacToe game = new TicTacToe();

        // 2. Lógica
        game.placePiece(0, 0, 'X');
        game.placePiece(1, 0, '+');
        game.placePiece(0, 1, 'X');
        game.placePiece(1, 1, '+');
        game.placePiece(2, 1, 'X');

        // 3. Verificación
        assertNull(game.getGanador()); // aún no hay ganador
    }

    @Test
    public void siTresEnLineaHorizontal_esGanador() {
        // 1. Preparación
        TicTacToe game = new TicTacToe();

        // 2. Lógica
        game.placePiece(0, 0, 'X');
        game.placePiece(1, 0, '+');
        game.placePiece(0, 1, 'X');
        game.placePiece(1, 1, '+');
        game.placePiece(0, 2, 'X');

        // 3. Verificación
        assertEquals('X', (char) game.getGanador());
    }
    //Alex
    @Test
    public void siTresEnLineaVertical_esGanador() {
        // 1. Preparación
        TicTacToe game = new TicTacToe();

        // 2. Lógica
        game.placePiece(0, 0, 'X');
        game.placePiece(0, 1, '+');
        game.placePiece(1, 0, 'X');
        game.placePiece(1, 1, '+');
        game.placePiece(2, 0, 'X');

        // 3. Verificación
        assertEquals('X', (char) game.getGanador());
    }

    @Test
    public void siTresEnDiagonal_esGanador() {
        // 1. Preparación
        TicTacToe game = new TicTacToe();

        // 2. Lógica
        game.placePiece(0, 0, 'X');
        game.placePiece(0, 1, '+');
        game.placePiece(1, 1, 'X');
        game.placePiece(0, 2, '+');
        game.placePiece(2, 2, 'X');

        // 3. Verificación
        assertEquals('X', (char) game.getGanador());
    }


   
        
}
