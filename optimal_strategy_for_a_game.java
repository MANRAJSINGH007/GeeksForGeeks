import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{
    
    public static int optimalStrategy(int[] arr, int start, int end, int turn, int[][][] dp){
        
        if(start > end){
            return 0;
        }
        
        if(start == end){
            if(turn == 1){
                return arr[start];
            }
            
            return 0;
        }
        
        if(dp[start][end][turn] != -1){
            return dp[start][end][turn];
        }
        
        if(turn == 1){
            int x1 = optimalStrategy(arr, start + 1, end, 0, dp) + arr[start];
            int x2 = optimalStrategy(arr, start, end - 1, 0, dp) + arr[end];
            
            return dp[start][end][turn] = Math.max(x1, x2);
        }
        
        else{
            int x1 = optimalStrategy(arr, start + 1, end, 1, dp);
            int x2 = optimalStrategy(arr, start, end - 1, 1, dp);
            
            return dp[start][end][turn] = Math.min(x1, x2);
        }
        
    }

	public static void main (String[] args){
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j< t; j++){
            
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            
            int[][][] dp = new int[n][n][2];
            
            for(int i = 0; i < n; i++){
                for(int k = 0; k < n; k++){
                    dp[i][k][0] = -1;
                    dp[i][k][1] = -1;
                }
            }
            
            System.out.println(optimalStrategy(arr, 0, n - 1, 1, dp));
        }
    }
}
