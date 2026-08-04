package BinarySearch;

import java.util.Scanner;

public class AlgorithamOfBinarySearch {
    public static void main(String[] args) {
    System.out.print("Enter your targate Element: ");
    Scanner sc = new Scanner(System.in);
    int arr[] ={3,6,8,12,15,45,67,87,98};
    int n = arr.length;
    int targate = sc.nextInt();
    int low =0, high =n-1;
    boolean flage = false;
    while(low<=high){
        int mid =(high+low)/2;
        if(arr[mid]<targate)
         low =mid+1;
        else if(arr[mid]>targate)
         high = mid-1;
        else if(arr[mid]==targate){
            flage = true;
            break;
        }
    }
    if(flage) System.out.println("Element found");
    else System.out.println("Element not found");
    }
    
 }