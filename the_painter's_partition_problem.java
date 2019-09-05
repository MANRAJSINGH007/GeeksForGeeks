import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{
    
    public static int painterPartition(int[] arr, int i, int n, int k, int[][] dp, int[] sum){
        
        if(k == 1){
            if(i == 0){
                return sum[n - 1];
            }
            
            return sum[n - 1] - sum[i - 1];
        }
        
        if(i == n){
            return 0;
        }
        
        if(dp[i][k] != -1){
            return dp[i][k];
        }
        
        int min = Integer.MAX_VALUE;
        
        int s = 0;
        
        for(int j = i; j < n; j++){
            
            s += arr[j];
            int small = painterPartition(arr, j + 1, n, k - 1, dp, sum);
            
            if(small != Integer.MAX_VALUE){
                small = Math.max(small, s);
                min = Math.min(min, small);
            }
        }
        
        return dp[i][k] = min;
        
    }

	public static void main (String[] args){
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j < t; j++){
            
            int k = sc.nextInt();
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            int[] sum = new int[n];
            
            int s = 0;
            
            for(int  i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                s += arr[i];
                sum[i] = s;
            }
            
            int[][] dp = new int[n][k + 1];
            for(int i = 0; i < n; i++){
                for(int p = 0; p <= k; p++){
                    dp[i][p] = -1;
                }
            }
            
            int ans = painterPartition(arr, 0, n, k, dp, sum);
            
            if(ans == Integer.MAX_VALUE){
                ans = -1;
            }
            
            System.out.println(ans);
        }
    }
}
