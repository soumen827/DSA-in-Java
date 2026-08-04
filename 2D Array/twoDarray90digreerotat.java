package MultidimensionalArray;

public class twoDarray90digreerotat {

    public static void print(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length, n =arr[0].length;
        print(arr);
        System.out.println("Reverse of this Array is: ");
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j <=i; j++) {
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
      }
       print(arr);
       System.out.println("Rotate 90 digree: ");
      for (int i = 0; i < m; i++) {
        int a =0, b =m-1;
        while (a<b) {
            int temp = arr[i][b];
            arr[i][b] = arr[i][a];
            arr[i][a] =temp;
            a++;b--;
        }
      }
      print(arr);

    }


}