package Recursion;

import java.util.Scanner;

public class Nth_Stair {
    public static int stir(int n){
         if(n<=2) return 1;
         if(n==3) return 2;
        return stir(n-1)+ stir(n-3);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your N: ");
        int n = sc.nextInt();
        System.out.println(stir(n));


    }
    
}
