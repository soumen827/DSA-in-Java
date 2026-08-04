package MultidimensionalArray;

import java.util.Scanner;

public class firstQuestionin2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[4][2];
        
        int m = arr.length;
        int n = arr[0].length;
         System.out.print("Enter your roll and Marks: ");
        for( int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // int[][] arr ={{80,5},{90,4},{69,8},{95,1}};
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        
    }
}
