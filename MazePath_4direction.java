public class MazePath_4direction {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols]; // F
        path(0, 0, rows-1, cols-1,"",isVisited);
    }
    public static void path(int Srow, int Scol, int erow, int ecol, String S, boolean[][] isVisited) {
        if(Srow>erow || Scol>ecol) return;
        if(Srow<0 || Scol<0) return;
        if(isVisited[Srow][Scol]==true) return;
        if(Srow==erow && Scol==ecol) {
            System.out.println(S);
            return;
        }
        isVisited[Srow][Scol] = true;
        // go right
        path(Srow,Scol+1,erow,ecol,S+"R",isVisited);
        // go down
        path(Srow+1,Scol,erow,ecol,S+"D",isVisited);
        // go left
        path(Srow,Scol-1,erow,ecol,S+"L",isVisited);
        // go up
        path(Srow-1,Scol,erow,ecol,S+"U",isVisited);
        // backtrack
        isVisited[Srow][Scol] = false;
    }
}
