package Recursion;
import java.util.Scanner;
public class MazePath {
    public static int Maze2(int n,int m){
        if(n==1 || m==1) return 1;
        int right = Maze2(n,m-1);
        int down = Maze2(n-1,m);
        return right+down;
    }
    public static int Maze(int row, int coll,int n, int m){
        if(row==n || coll==m) return 1;
        //if(row==n && coll==m) return 1;
        //if(row>n || coll>m) return 0;

        int right = Maze(row,coll+1,n,m);
        int down = Maze(row+1,coll,n,m);
        return right+down;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Row no: ");
        int n = sc.nextInt();
         System.out.print("Enter Your Collam no: ");
        int m = sc.nextInt();
        System.out.println("Your Total no of path is "+Maze2(n,m));
        System.out.println("Your Total no of path is "+Maze(1,1,n,m));
         

    }
    
}
