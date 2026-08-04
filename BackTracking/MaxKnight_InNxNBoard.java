public class MaxKnight_InNxNBoard {
    static int maxKnight = -1;
    static int number = 8;
    public static void main(String[] args) {
        int n =4 ;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        System.out.println("All posible combinatio are: ");
        nKnight(board, 0, 0, 0);
        System.out.println("Max No of Knight: "+maxKnight);
    }
    public static boolean isSafe(char[][] board,int row, int col){
         int i,j;
         int n = board.length;
        // 2up left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == 'K') return false;
        // 2up right
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
    public static void nKnight(char[][] board,int row, int col, int num){
        int n = board.length;
        if(row==n) {
            if(num==number){
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        System.out.print(board[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            maxKnight = Math.max(maxKnight,num);
            return;
        }
        else if(isSafe(board,row,col)){
            board[row][col] ='K';
            if(col!=n-1) nKnight(board,row,col+1,num+1); // next ele next ele
            else nKnight(board,row+1,0,num+1);  // ager us row khatam to nest row se start searching
            board[row][col] ='X'; // BackTracking Bro
        }
        if(col!=n-1) nKnight(board,row,col+1,num); // next ele next ele
        else nKnight(board,row+1,0,num); // num+1 nehi hoya K to varahi nehi
    }
}
