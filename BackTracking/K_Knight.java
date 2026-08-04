public class K_Knight {
    static int number = 3;

    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nKnight(board, 0, 0, 0);
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        int i, j;
        int n = board.length;

        // 2 up left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == 'K') return false;

        // 2 up right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && board[i][j] == 'K') return false;

        // 2 down left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && board[i][j] == 'K') return false;

        // 2 down right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && board[i][j] == 'K') return false;

        // 2 right up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && board[i][j] == 'K') return false;

        // 2 right down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && board[i][j] == 'K') return false;

        // 2 left up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == 'K') return false;

        // 2 left down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && board[i][j] == 'K') return false;

        return true;
    }

    public static void nKnight(char[][] board, int row, int col, int num) {
        int n = board.length;
        // Required number of knights placed
        if (num == number) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }   

        // Board finished
        if (row == n)  return;
    

        // Place Knight
        if (isSafe(board, row, col)) {
            board[row][col] = 'K';

            if (col != n - 1) nKnight(board, row, col + 1, num + 1);
            else  nKnight(board, row + 1, 0, num + 1);

            board[row][col] = 'X';
        }

        // Don't Place Knight
        if (col != n - 1) nKnight(board, row, col + 1, num);
        else   nKnight(board, row + 1, 0, num);
    }
}
