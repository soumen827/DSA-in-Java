package MultidimensionalArray;

public class spiralfromin2Darray {
    private static final int[][] INTS = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
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
        int[][] arr = INTS;
        int m =arr.length; int  n = arr[0].length;
        print(arr);
            // spiral print
            int minr= 0, maxr = m-1;
            int minc =0, maxc =n-1;
            while(minc<=maxc && minr<=maxr){
                // Blue line
                 for(int j = minc;j<=maxc;j++){
                    System.out.print(arr[minr][j]+" ");
                 }
                 minr++;
                 // Orange line
                 if(minr>maxr || minc>maxc) break;
                 for(int i =minr; i<=maxr;i++){
                    System.out.print(arr[i][maxc]+" ");
                 }
                 maxc--;
                 //Red line
                 if(minr>maxr || minc>maxc) break;
                 for(int j =maxc;j>=minc;j--){
                    System.out.print(arr[maxr][j]+" ");
                 }
                 maxr--;

                 // Gerrn line 
                 if(minr>maxr || minc>maxc) break;
                 for(int i=maxr; i>=minr;i--){
                    System.out.print(arr[i][minc]+" ");
                 }
                 minc++;
            }
    }
}
