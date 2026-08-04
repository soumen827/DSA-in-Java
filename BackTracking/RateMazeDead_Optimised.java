public class RateMazeDead_Optimised {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] maze =  {{1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1}}; 

        path(0, 0, rows-1, cols-1,"",maze);
    }
    public static void path(int Srow, int Scol, int erow, int ecol, String S,int [][] maze) {
     if(Srow>erow || Scol>ecol) return;
        if(Srow<0 || Scol<0) return;
        if(maze[Srow][Scol]==-1) return;
        if(Srow==erow && Scol==ecol) {
            System.out.println(S);
            return;
        }
        if(maze[Srow][Scol]==0) return; // dead spot
        maze[Srow][Scol] = -1; // mark as visited
        // go right
        path(Srow,Scol+1,erow,ecol,S+"R",maze);
        // go down
        path(Srow+1,Scol,erow,ecol,S+"D",maze);
        // go left
        path(Srow,Scol-1,erow,ecol,S+"L",maze);
        // go up
        path(Srow-1,Scol,erow,ecol,S+"U",maze);
        // backtrack
        maze[Srow][Scol] = 1; // for next path we need to mark it as unvisited
    }
}
