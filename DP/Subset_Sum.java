public class Subset_Sum {
    //similar as knapsack
    public static void main(String[] args) {
        int[] arr = {8,5,2,4,};
        int target =16;
        int n = arr.length;
        int[][] dp = new int[n+1][target+1];
        for(int i=0;i<dp.length;i++){
           for(int j=0;j<dp[0].length;j++){
            dp[i][j] =-1;
           }
        }
         
        System.out.println(subset(0,arr,target,dp));
    }

    private static boolean subset(int i,int[] arr, int target,int[][]dp) {
        int n = arr.length;
        if(i==n){ // last tak agaya
            if(target==0) return true;
            else return false;
        }
        boolean ans = false; //extra
        if(dp[i][target]!= -1) return (dp[i][target]==1);// dp int ka hay and return type bool
        boolean skip = subset(i+1,arr,target,dp);
        if(target-arr[i]<0) ans = skip;
        else{
           boolean take = subset(i+1,arr,target-arr[i],dp);//take matlab sum+ us arry idx
           ans = take || skip;
        }
        if(ans==true) dp[i][target] = 1;
        else  dp[i][target] =0;
        return ans;
    }

}
