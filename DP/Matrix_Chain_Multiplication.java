 public class Matrix_Chain_Multiplication {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3},{3,4},{4,2}};
        int n = arr.length;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(mcm(0,n-2,arr,dp));
    }

    private static int mcm(int i, int j, int[][] arr,int[][]dp) {
       int mincost = Integer.MAX_VALUE;
        if(i==j) return 0;
        if(dp[i][j] != -1) return  dp[i][j];
        for(int k = i;k<j;k++){
            int x = arr[i][0] * arr[j][1] * arr[k][1];
            int totalCost = mcm(i,k,arr,dp) + mcm(k+1,j,arr,dp) + x;
            mincost = Math.min(mincost,totalCost);
        }
        return dp[i][j] = mincost;

    }

}
