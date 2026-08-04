package StringBuilders;

import java.util.Arrays;
import java.util.Scanner;

public class StirngShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        StringBuilder s=  new StringBuilder(sc.nextLine());
        char [] arr=   s.toString().toCharArray();

        Arrays.sort(arr);
        System.out.print("Shoted String: ");
         for(char ele: arr){
            System.out.print(ele);
         }
         System.out.println();
         
    }
}
