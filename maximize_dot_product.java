import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{
    
    public static long func(int[] arr, int[] brr, int n, int m, int i, int j , long[][] dp){
        
        if(j==m){
            return 0;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        if(n-i>m-j){
            
            long max1=func(arr,brr,n,m,i+1,j,dp);
            long max2=(long)arr[i]*brr[j]+func(arr,brr,n,m,i+1,j+1,dp);
            
            return dp[i][j]=Math.max(max1,max2);
        }
        
        else{
            return dp[i][j]=(long)arr[i]*brr[j]+func(arr,brr,n,m,i+1,j+1,dp);
        }
        
    }

	public static void main (String[] args){
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            
            int n=sc.nextInt();
            int m=sc.nextInt();
            
            int arr[]=new int[n];
            int brr[]=new int[m];
            
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            for(int i=0;i<m;i++){
                brr[i]=sc.nextInt();
            }
            
            long dp[][]=new long[n][m];
            for(int i=0;i<n;i++){
                for(int k=0;k<m;k++){
                    dp[i][k]=-1;
                }
            }
            
            System.out.println(func(arr,brr,n,m,0,0,dp));
        }
    }
}
