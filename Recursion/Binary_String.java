package Recursion;

import java.util.Scanner;

public class Binary_String {
    public static void BinaryString(String ans,int n){
        int len = ans.length();
        if(len==n){
            System.out.println(ans);
            return;
        }
        if(len==0 || ans.charAt(len-1)=='0'){
            BinaryString(ans+0, n);
            BinaryString(ans+1, n);

        }
        else BinaryString(ans+0,n);
        
    }
    public static void main(String[] args) {
        System.out.print("Enter your N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         BinaryString("",n);
    }
    
}
