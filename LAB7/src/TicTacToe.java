import java.lang.reflect.Array;

public class TicTacToe {

    private final char EMPTY = ' ';
    private final char X = 'X';
    private final char O = 'O';

    private char currentPlayer;
    private char[][] board;

    public TicTacToe() {
        currentPlayer = 'X';
        board = new char[3][3];

        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
                board[rowIndex][columnIndex] = EMPTY;

            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
                result += board[rowIndex][columnIndex] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    private boolean someoneWonByRow() {
        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            if (board[rowIndex][0] != EMPTY
                    && board[rowIndex][0] == board[rowIndex][1]
                    && board[rowIndex][0] == board[rowIndex][2]) {
                return true;
            }
        }
        return false;
    }

    private boolean someoneWonByColumn() {
        for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
            if (board[0][columnIndex] != EMPTY
                    && board[0][columnIndex] == board[1][columnIndex]
                    && board[0][columnIndex] == board[2][columnIndex]) {
                return true;
            }
        }
        return false;
    }

    private boolean someoneWonByDiagonal() {
        return board[1][1] != EMPTY && (
                (board[1][1] == board[0][0] && (board[1][1] == board[2][2]))
                        || (board[1][1] == board[2][0] && (board[1][1] == board[0][2]))
        );
    }

    public boolean someoneWon() {
        return someoneWonByRow() || someoneWonByColumn() || someoneWonByDiagonal();
    }

    public boolean isTied() {
        if (someoneWon()) {
            return false;
        }
        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
                if (board[rowIndex][columnIndex] == EMPTY) {
                    return false;
                }
            }
        }
        // if it didn't find an empty space
        return true;
    }

    public boolean isGameOver() {
        return isTied() || someoneWon();
    }

    public boolean mark(int rowIndex, int columnIndex) {
        if (rowIndex < 0 || rowIndex >= 3 || columnIndex < 0 || columnIndex >= 3
                || board[rowIndex][columnIndex] != EMPTY) {
            return false;
        }
        board[rowIndex][columnIndex] = currentPlayer;

        if (currentPlayer == X) {
            currentPlayer = O;
        } else {
            currentPlayer = X;
        }


        return true;
    }
}