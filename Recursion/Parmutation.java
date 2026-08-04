package Recursion;

import java.util.Scanner;

public class Parmutation {
    public static void printParmutation(String ans,String s){  
            if(0==s.length()){
                System.out.println(ans);
                return;
            }
            for(int i=0;i<s.length();i++){
            String left = s.substring(0, i);
            String right = s.substring(i+1);
            char ch = s.charAt(i);
            printParmutation(ans+ch,left+right);
            
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = "abc";
        System.out.print("Enter your String: ");
        String s;
            s = sc.nextLine();
            System.out.println();
        printParmutation("",s);

    }
    
}
