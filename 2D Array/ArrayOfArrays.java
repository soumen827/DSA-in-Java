package MultidimensionalArray;

public class ArrayOfArrays {
    public static void main(String[] args) {
        
        int[][]arr = {{2,4,5},{5,8,6,},{7,6,4}};
        int m =arr.length;
        int n = arr[0].length;
        // for(int i=0;i<m;i++){
        //     for(int j =0;j<n;j++){
        //         System.out.print(arr[i][j]+"  ");
        //     }
        //     System.out.println();
        // }
        for(int[]ele : arr){
             for( int x : ele){
                System.out.print(x+"  ");
             }
             System.out.println();
        }
    

    }
}
