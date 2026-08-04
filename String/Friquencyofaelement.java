package StringBuilders;

import java.util.*;

public class Friquencyofaelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0,element =0;
        System.out.print("ENTER THE SIZE OF THE ARRAY: :");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.print("ENTER YOUR ARRAY ELEMENT:");
        for (int i = 0; i < arr.length; i++) {
           arr[i]=  sc.nextInt();
        }
        System.out.print("Enter the elemnt to count the friquency: ");
           element =sc.nextInt();
          for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                count++;
            }
          }
          System.out.println("YOUR TARGET ELEMENT IS: "+element);
          System.out.println("FRIQUENCY OF YOUR TARGET ELEMENT: "+count);
    }
}
