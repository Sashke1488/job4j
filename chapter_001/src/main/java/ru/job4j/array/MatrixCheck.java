package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = row; j < board.length; j++)
                if (board[i][row] != 'X') {
                    result = false;
                    break;
                }
        }
        return result;
    }
}