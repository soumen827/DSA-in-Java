public class Unbouned_Knapsack {
    public static int profit(int idx,int[] wt,int[] val,int cap,int[][]dp){
        if(idx==wt.length) return 0;
        if(dp[idx][cap]!=-1) return dp[idx][cap];
        int skip = profit(idx+1, wt, val, cap,dp);
        if(wt[idx]>cap) return dp[idx][cap] = skip; 
         
        int take = val[idx]+profit(idx, wt, val, cap-wt[idx],dp);
        return dp[idx][cap] = Math.max(take,skip);
    }
    public static void main(String[] args) {
         
        int[] val = {6,3,9,25};
        int[] wt = {2,2,8,9};
        int cap = 9;
        int n = val.length;
        int [][] dp = new int[n][cap+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]= -1;
            }
        }
        System.out.println(profit(0,wt, val, cap,dp));
    }
}
