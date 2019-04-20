import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int func(String[] s, int n, int i, boolean[] visited, int[][] dp)
    {
        if(i==n)
        {
            return 0;
        }
        // calculate the mask
        int mask=0;
        for(int y=0;y<10;y++)
        {
            if(visited[y])
            {
                mask+=Math.pow(2,y);
            }
        }
        if(dp[i][mask]!=-1)
        {
            return dp[i][mask];
        }
        String current=s[i];
        int flag=0;
        int temp[]=new int[10];
        for(int k=0;k<current.length();k++)
        {
            int num=(int)current.charAt(k)-48;
            if(visited[num])
            {
                flag=1;
                break;
            }
            temp[num]=1;
        }
        int m1=0;
        int m2=0;
        if(flag==0)
        {
            for(int k=0;k<10;k++)
            {
                if(temp[k]==1)
                {
                  visited[k]=true;  
                }
            }
            
            m1=Integer.parseInt(s[i])+func(s,n,i+1,visited,dp);
            for(int k=0;k<10;k++)
            {
                if(temp[k]==1)
                {
                  visited[k]=false;  
                }
            }
        }
        
        m2=func(s,n,i+1,visited,dp);
        
        return dp[i][mask]=Math.max(m1,m2);
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
		    int n=sc.nextInt();
		    String s[]=new String[n];
		    for(int i=0;i<n;i++)
		    {
		        s[i]=sc.next();
		    }
		    boolean visited[]=new boolean[10];
		    int dp[][]=new int[n][1024];
		    for(int i=0;i<n;i++)
		    {
		        for(int k=0;k<1024;k++)
		        {
		            dp[i][k]=-1;
		        }
		    }
		    System.out.println(func(s,n,0,visited,dp));
		}
	}
}
