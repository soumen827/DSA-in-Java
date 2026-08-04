package Recursion;
import java.util.Scanner;
public class nFactorial {
    public static int fact(int n){
        if(n==1) return 1;
        int ans = n*fact(n-1);
        return ans;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = sc.nextInt();
        System.out.println(n+" Ka Facttorial he: "+fact(n));


        
    }
    
}
