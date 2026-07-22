public class MazePath {
  public static void main(String[] args) {
      int rows =3;
      int cols =4;
      int count = maze(0,0,rows-1,cols-1);
      System.out.println(count);
    
  }
  private static int maze(int Srow, int Scol, int erow, int ecol) {
      if(Srow==erow && Scol==ecol) return 1;
      if(Srow>erow || Scol>ecol) return 0;
      int downWays = maze(Srow+1,Scol,erow,ecol);
      int rightWays = maze(Srow,Scol+1,erow,ecol);
      int totalWays = downWays+rightWays;
      return totalWays;
      
  }
}