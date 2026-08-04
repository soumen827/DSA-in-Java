package MultidimensionalArray;

import java.util.Scanner;

public class Convertinttostring {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter yor int no: ");
        int n = sc.nextInt();
        String s = n+"";
        System.out.println(s);
        System.out.println(s.length());
    }
}
