public class RateInADeadMaze {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] maze = {{1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1}}; 

        boolean[][] isVisited = new boolean[rows][cols];
        path(0, 0, rows-1, cols-1,"",maze,isVisited);
    }
    public static void path(int Srow, int Scol, int erow, int ecol, String S,int [][] maze, boolean[][] isVisited) {
        if(Srow>erow || Scol>ecol) return;
        if(Srow<0 || Scol<0) return;
        if(isVisited[Srow][Scol]==true) return;
        if(Srow==erow && Scol==ecol) {
            System.out.println(S);
            return;
        }
        if(maze[Srow][Scol]==0) return; // dead spot
        isVisited[Srow][Scol] = true;
        // go right
        path(Srow,Scol+1,erow,ecol,S+"R",maze,isVisited);
        // go down
        path(Srow+1,Scol,erow,ecol,S+"D",maze,isVisited);
        // go left
        path(Srow,Scol-1,erow,ecol,S+"L",maze,isVisited);
        // go up
        path(Srow-1,Scol,erow,ecol,S+"U",maze,isVisited);
        // backtrack
        isVisited[Srow][Scol] = false;
    }
}
