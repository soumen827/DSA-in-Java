package MultidimensionalArray;
 
public class Mul2matrix {

    public static void print(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
     public static void main(String[] arr) {
        int[][] a = {{2,4,5},{6,8,6}};
        int[][] b = {{8,7,6,5,4},{7,8,1,6,8},{4,5,6,3,6}}; 
        
         int[][]c = new int[a.length][b[0].length];
         if(a[0].length != b.length){
            System.out.println("This mul is not possible");
         }else{
            for (int i = 0; i < c.length; i++) {
                 for (int j = 0; j < c[0].length; j++) {
                    //c[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j];

                    for (int k = 0; k < a[0].length; k++) {
                        c[i][j] += a[i][k]*b[k][j];
                    }
                 }
            }
            System.out.println("A is: ");
            print(a);
            System.out.println("B is: ");
            print(b);
            System.out.println("Multifuction of a and b is: ");
           System.out.println();
            print(c);
         }
    }
}