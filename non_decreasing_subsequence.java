import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int func(int[] arr, int n, int i, int prev, int k, int[][][] dp){
        
        if(k==0){
            return 0;
        }
        
        if(i==n){
            return Integer.MAX_VALUE;
        }
        
        if(dp[i][prev][k]!=-1){
            return dp[i][prev][k];
        }
        
        int m1=Integer.MAX_VALUE;
        int m2=0;
        if(arr[i]>=arr[prev]){
            m1=func(arr,n,i+1,i,k-1,dp);
            if(m1!=Integer.MAX_VALUE){
                m1+=arr[i];
            }
        }
        
        m2=func(arr,n,i+1,prev,k,dp);
        
        return dp[i][prev][k]=Math.min(m1,m2);
        
    } 
     
     
	public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            int dp[][][]=new int[n][n][k+1];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    for(int p=0;p<=k;p++){
                        dp[i][j][p]=-1;
                    }
                }
            }
            
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int temp=func(arr,n,i+1,i,k-1,dp);
                if(temp!=Integer.MAX_VALUE){
                    temp+=arr[i];
                }
                min=Math.min(min,temp);
                
            }
            
            if(min==Integer.MAX_VALUE){
                min=-1;
            }
            
            System.out.println(min);
            
        }
    }
}
