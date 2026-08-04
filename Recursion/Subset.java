package Recursion;
import java.util.ArrayList;
public class Subset {
     static ArrayList<String> s = new ArrayList<>();
       public static void subset(int i, int[]arr , String ans){
        if(i== arr.length){
               s.add(ans);
            return;
        }
        int idx =  arr[i];
        subset(i+1, arr, ans); // Not take
         subset(i+1, arr, ans+idx); // take
         
    }
    public static void main(String[] args) {
        int [] arr = {4,7,3};
        subset(0,arr,"");
        System.out.println(s);
    }
}