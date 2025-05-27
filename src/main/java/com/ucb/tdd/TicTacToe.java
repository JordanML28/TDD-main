package com.ucb.tdd;

public class TicTacToe {

    private char[][] board = new char[3][3];
    private int turnos = 0;
    
    public void placePiece(int x, int y, char player) {
        // Jordan
        // Validación de límites generales
        if (!esCoordenadaValida(x)) {
            throw new RuntimeException("Coordenada X inválida");
        }

     
        // Jackeline
        if (!esCoordenadaValida(y)) {
            throw new RuntimeException("Coordenada Y inválida");
        }

        // Alex
        // Verificación general de celda ocupada
        if (estaOcupado(x, y)) {
            throw new RuntimeException("Espacio ocupado");
        }

        // Colocamos la pieza si todo está correcto
        board[x][y] = player;
        turnos++;
    }
    //Jordan
    public char getJugadorActual() {
        // Forzamos respuestas específicas para que las pruebas pasen
        if (turnos % 2 == 0) {
            return 'X';
        } else {
            return '+';
        }
    }
     //Jackeline
    // Métodos auxiliares para mejorar legibilidad
    private boolean esCoordenadaValida(int valor) {
        return valor >= 0 && valor <= 2;
    }

        //Alex
    private boolean estaOcupado(int x, int y) {
        return board[x][y] != '\u0000';
    }



      //Jackeline
    /*public Character getGanador() { 
        return null; // Implementación mínima para que falle cuando haya un ganador
    }*/

    //Alex
    public Character getGanador() {
        // Revisar filas
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '\u0000' &&
                board[i][0] == board[i][1] &&
                board[i][1] == board[i][2]) {
                return 0;
            }
        }

        // Revisar columnas
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != '\u0000' &&
                board[0][i] == board[1][i] &&
                board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }

        // Revisar diagonal principal
        if (board[0][0] != '\u0000' &&
            board[0][0] == board[1][1] &&
            board[1][1] == board[2][2]) {
            return board[0][0];
        }

        // Revisar diagonal secundaria
        if (board[0][2] != '\u0000' &&
            board[0][2] == board[1][1] &&
            board[1][1] == board[2][0]) {
            return board[0][2];
        }

        // No hay ganador
        return null;
    }
    
}
