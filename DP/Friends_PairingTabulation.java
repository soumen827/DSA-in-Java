import java.util.Scanner;
public class Friends_PairingTabulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Student: ");
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        dp[1] =1;
        if(n>2) dp[2] =2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        System.out.println("Total no of Pair: "+dp[n]);
    }
}
