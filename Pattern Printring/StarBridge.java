package PatternPrinting;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Row number:");
        int n= sc.nextInt();
        for(int i =1; i<=2*n-1; i++){
            System.out.print("*");
        }
            System.out.println();
             n--;
        for( int i =1; i<=n; i++){
            for( int j=1; j<=n+1-i; j++){
                System.out.print("*");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print(" ");
            }
            for(int l = 1; l<=n+1-i; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
