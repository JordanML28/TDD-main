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

  //Jackeline
    @Test(expected = RuntimeException.class)
    public void cuandoPiezaFueraDelEjeY_lanzarExcepcion() {
        // 1. Preparación
        TicTacToe juego = new TicTacToe();

        // 2. Lógica
        juego.placePiece(0, 3, 'X'); // posición inválida en Y

        // 3. Verificación (automática)
    }
}

    //Alex
    @Test(expected = RuntimeException.class)
    public void cuandoPiezaEnLugarOcupado_lanzarExcepcion() {
        // 1. Preparación
        TicTacToe juego = new TicTacToe();

        // 2. Lógica
        juego.placePiece(0, 0, 'X');
        juego.placePiece(0, 0, '+'); // ya está ocupado

        // 3. Verificación (automática)
    }
}
