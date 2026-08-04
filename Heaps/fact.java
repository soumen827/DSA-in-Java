import java.util.Scanner;
public class fact{
    public static void main(String[] args) {
        int fact =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array Ele: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Your Rotted Array is: ");
         for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
         }
    }
}