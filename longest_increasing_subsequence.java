import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int func(int[] arr, int n, int j, int prev, int[][] dp){
        
        if(dp[j][prev]!=-1){
            return dp[j][prev];
        }
        
        int max=0;
        
        for(int k=j+1;k<n;k++){
            
            if(arr[k]>arr[prev]){
                max=Math.max(max,1+func(arr,n,k,k,dp));
            }
            
            max=Math.max(max,func(arr,n,k,prev,dp));
        }
        
        return dp[j][prev]=max;
        
    }
     
	public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            int max=0;
            int dp[][]=new int[n][n];
            for(int i=0;i<n;i++){
                for(int k=0;k<n;k++){
                    dp[i][k]=-1;
                }
            }
            
            for(int i=0;i<n;i++){
                max=Math.max(max,1+func(arr,n,i,i,dp));
            }
            
            System.out.println(max);
        }
    }
}
