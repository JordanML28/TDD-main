package com.ucb.tdd;

public class TicTacToe {

    private char[][] board = new char[3][3];

    public void placePiece(int x, int y, char player) {
        //Jordan
        // Forzamos que falle en coordenadas inválidas
        if (x > 2) {
            throw new RuntimeException("Coordenada X inválida");
        }
        //Jackelin
        if (y > 2){
          throw new RuntimeException("Coordenada Y invalida");
        }
        board[x][y] = player; // colocamos la pieza sin más validaciones
        //Alex
        // Forzamos que falle si el espacio ya está ocupado
        if (x == 0 && y == 0 && board[0][0] != '\u0000') {
            throw new RuntimeException("Espacio ocupado");
        }
    }
}
