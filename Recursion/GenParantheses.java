package Recursion;

import java.util.Scanner;

public class GenParantheses {
    public static void Parantheses(int open, int close ,String s, int n){
        int len = s.length();
        if(len==2*n){
            System.out.println(s+" ");
            return;
        }
            if(close<open) Parantheses(open, close+1, s+']',n);

            if(open<n) Parantheses(open+1, close, s+"[",n);
           
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your N: ");
        int n = sc.nextInt();
        Parantheses(0,0,"",n);
         
    }
    
}
