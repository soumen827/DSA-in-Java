package BinarySearch;

import java.util.Scanner;

public class Fiest_Lastelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={10,10,20,20,20,20,20,30,30,30,40,40};
        int n =arr.length;
        int lo=0,hi=n-1;
        int LB= n;
        System.out.println("Enter tour target Element: ");
        int x = sc.nextInt();// target element
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>x){
                LB= Math.min(mid, LB);
                hi = mid-1;

            }
            else lo = mid+1;
        }
        System.out.println(LB);
    }
}
