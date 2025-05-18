package com.ucb.tdd;

public class TicTacToe {

    private char[][] board = new char[3][3];

    public void placePiece(int x, int y, char player) {
        //Jordan
        // Validación de límites generales
        if (x < 0 || x > 2) {
            throw new RuntimeException("Coordenada X inválida");
        }

        // Colocamos la pieza si todo está correcto
        board[x][y] = player;
    }
}
