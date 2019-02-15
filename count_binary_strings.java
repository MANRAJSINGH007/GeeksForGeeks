import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int mod=(int)Math.pow(10,9)+7;
     
     public static int func(int n, int k, int prev, int[][][] dp)
     {
         if(k<0 || n<0)
         {
             return 0;
         }
         if(n==0)
         {
             if(k==0)
             {
                 return 1;
             }
             
             return 0;
         }
         
         if(dp[n][k][prev]!=-1)
         {
             return dp[n][k][prev];
         }
         
         if(prev==0)
         {
             int m1=func(n-1,k,0,dp);
             int m2=func(n-1,k,1,dp);
             
             long temp=(long)0+m1+m2;
             
             return dp[n][k][prev]=(int)temp%mod;
             
         }
         
         else
         {
             int m1=func(n-1,k,0,dp);
             int m2=func(n-1,k-1,1,dp);
             
             long temp=(long)0+m1+m2;
             
             return dp[n][k][prev]=(int)temp%mod;
         }
         
     }
	  public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int dp[][][]=new int[n][k+1][2];
            
            for(int i=0;i<n;i++)
            {
                for(int p=0;p<=k;p++)
                {
                    dp[i][p][0]=-1;
                    dp[i][p][1]=-1;
                }
            }
            
            long ans=(long)0+func(n-1,k,0,dp)+func(n-1,k,1,dp);
            
            System.out.println((int)ans%mod);
            
        }
    }
}
