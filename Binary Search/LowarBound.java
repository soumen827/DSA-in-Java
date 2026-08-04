package BinarySearch;
import java.util.Scanner;
public class LowarBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] ={5,10,14,14,20,30,40,50,60,70};
        int n =arr.length;
        int lo=0,hi=n-1;
        int LB= n;
        System.out.print("Enter Your target Element: ");
        int x = sc.nextInt();// target element
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>=x){
                LB= Math.min(mid, LB);
                hi = mid-1;

            }
            else lo = mid+1;
        }
        System.out.print("Your Lowar Bound is: ");
        System.out.println(LB);
    }
}
 