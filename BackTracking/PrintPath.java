public class PrintPath {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        path(0, 0, rows-1, cols-1,"");
    }
    public static void path(int Srow, int Scol, int erow, int ecol, String S) {
        if(Srow>erow || Scol>ecol) return;
        if(Srow==erow && Scol==ecol) {
            System.out.println(S);
            return;
        }
        // go right
        path(Srow,Scol+1,erow,ecol,S+"R");
        // go down
        path(Srow+1,Scol,erow,ecol,S+"D");
         
    }
     
}
