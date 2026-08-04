package MultidimensionalArray;
public class Add2Matrix {
    public static void main(String[] args) {
        
        int[][] a ={{7,5,4},{8,6,4},{7,4,6,}};
        int[][] b ={{9,8,7},{5,9,7},{12,65,19}};
        int m = a.length;
        int n = a[0].length;
        int[][] result = new int[3][3];
        for(int i=0;i<m;i++){
            for (int j = 0; j<n; j++) {
                result[i][j] = a[i][j]+b[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
