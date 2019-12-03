import java.util.*;
import java.io.*;
class GFG{
    
    static int mod = (int)Math.pow(10, 9) + 7;
    static int k;
    
    public static int func(int n, int flag, int[][] dp){
        
        if(n == 0) return 1;
        
        if(dp[n][flag] != -1) return dp[n][flag];
        
        if(flag == 1){
            long ans = ((long)(k - 1) * func(n - 1, 0, dp)) % mod;
            return dp[n][flag] = (int)ans;
        }
        
        long ans = ((long)(k - 1) * func(n - 1, 0, dp)) % mod;
        ans = (ans + func(n - 1, 1, dp)) % mod;
        
        return dp[n][flag] = (int)ans;
        
    }

	public static void main (String[] args){
        //code
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int j = 0; j < T; j++){
        
            int n = sc.nextInt();
            k = sc.nextInt();
            int[][] dp = new int[n][2];
            for(int i = 0; i < n; i++){
                for(int t = 0; t < 2; t++) dp[i][t] = -1;
            }
            
            long ans = ((long)k * func(n - 1, 0, dp)) % mod;
            System.out.println((int)ans);
        }
    }
}
