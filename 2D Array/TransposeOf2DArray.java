package MultidimensionalArray;

public class TransposeOf2DArray{
    public static void main(String[] args){
        int[][] arr ={{6,4},{6,9},{3,9}};
        int m =arr.length;
        int n =arr[0].length;
        int [][] trans = new int[n][m];
        for (int j = 0; j <n; j++){
            for (int i = 0; i <m; i++){
               System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println();

        //     for (int i = 0; i < 3; i++) {
        //          for (int j = 0; j < 3; j++) {
        //             trans[j][i] =arr[i][j];
        //             System.out.print(trans[i][j]+" ");
        //          }
        //          System.out.println();
        //  }
     }
}
