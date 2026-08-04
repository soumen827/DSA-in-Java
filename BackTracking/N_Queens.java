public class N_Queens {
    static int n = 4;
    public static void main(String[] args) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        nqueen(board,0);
    }

    private static void nqueen(char[][] board, int row) {
        if(row==n) { // every row me ak ak queen ay gaya to
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
       for(int j=0;j<n;j++){ // Work and Call
            if(isSafe(board,row,j)){
                board[row][j]= 'Q';
                nqueen(board, row+1); // Recursion
                board[row][j]= 'X'; // BackTracking
            }
        }
    }
    private static boolean isSafe(char[][] board, int row, int col) {
        // check row
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }
        // check col
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }
        //check North East
        int i = row;
        int j = col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        //check South East
            i = row;
            j = col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }
        // check for South West
            i = row;
            j = col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
         // check for Notrh West
            i = row;
            j = col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        return true;
    }
}