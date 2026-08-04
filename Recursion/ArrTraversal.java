package Recursion;
public class ArrTraversal {
     
    public static void print(int i,int[] arr){
        if(i==arr.length) return ;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
        
        
    }
    public static void main(String[] args) {
        int[] arr = {3,5,3,5,3,5,3667,3,3};
        print(0,arr);
}
}