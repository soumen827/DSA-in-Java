package BinarySearch;

import java.util.Scanner;

public class LiniarSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Target Element:");
        int x = sc.nextInt();
        System.out.print("Enter your Array Length: ");
        int y = sc.nextInt();
        int [] arry = new int[y];
        System.out.print("Enter your Array Element: ");
         for(int i=0;i<arry.length;i++){
            arry[i] = sc.nextInt();
         }
         boolean flage =false;
         for(int i=0;i<arry.length;i++){
            if(arry[i]==x){
                flage = true;
                break;
            }
         }
         if(flage==true) System.out.println(" Element is found. Your Target element is "+x);
         else System.out.println(" Element  is not found ");

    }
}
