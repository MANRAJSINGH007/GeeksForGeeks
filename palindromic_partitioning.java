
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static boolean check(String s, int start, int end)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
    public static int func(String s, int start, int end, int[][] dp)
    {
        if(dp[start][end]!=-1)
        {
            return dp[start][end];
        }
        if(check(s,start,end))
        {
            return dp[start][end]=1;
        }
        int min=end-start+1;
        for(int i=start+1;i<=end;i++)
        {
            int a1=func(s,start,i-1,dp);
            int a2=func(s,i,end,dp);
            int ans=a1+a2;
            if(ans<min)
            {
                min=ans;
            }
        }
        
        return dp[start][end]=min;
        
    }
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int j=0;j<t;j++)
		{
		    String s=br.readLine();
		    int n=s.length();
		    int dp[][]=new int[n][n];
		    for(int i=0;i<n;i++)
		    {
		        for(int k=0;k<n;k++)
		        {
		            if(k==i)
		            {
		                dp[i][k]=1;
		            }
		            else
		            {
		             dp[i][k]=-1;   
		            }
		        }
		        
		    }
		    System.out.println(func(s,0,n-1,dp)-1);
		}
	}
}
