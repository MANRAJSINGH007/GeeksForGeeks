
import java.util.*;
import java.lang.*;
import java.io.*;

class Pair{
    long x1;
    long x2;
}

class GFG {
    public static Pair func(String str, int start, int end, Pair[][] dp)
    {
        // if(start>end)
        // {
        //     return new Pair();
        // }
        if(start==end)
        {
            if(str.charAt(start)=='T')
            {
                Pair obj=new Pair();
                obj.x1=1;
                return obj;
            }
            
            Pair obj=new Pair();
            obj.x2=1;
            return obj;
        }
        if(dp[start][end]!=null)
        {
            return dp[start][end];
        }
        
        Pair obj=new Pair();
        
        for(int i=start;i<=end;i++)
        {
            char ch=str.charAt(i);
            if(ch=='&')
            {
                Pair temp1=func(str,start,i-1,dp);
                Pair temp2=func(str,i+1,end,dp);
                obj.x1+=temp1.x1*temp2.x1;
                obj.x2+=temp1.x1*temp2.x2+temp1.x2*temp2.x1+temp1.x2*temp2.x2;
            }
            else if(ch=='|')
            {
                Pair temp1=func(str,start,i-1,dp);
                Pair temp2=func(str,i+1,end,dp);
                obj.x1+=temp1.x1*temp2.x2+temp1.x2*temp2.x1+temp1.x1*temp2.x1;
                obj.x2+=temp2.x2*temp1.x2;
            }
            else if(ch=='^')
            {
                Pair temp1=func(str,start,i-1,dp);
                Pair temp2=func(str,i+1,end,dp);
                obj.x1+=temp1.x1*temp2.x2+temp1.x2*temp2.x1;
                obj.x2+=temp1.x1*temp2.x1+temp1.x2*temp2.x2;
            }
            
        }
        obj.x1=obj.x1%1003;
        obj.x2=obj.x2%1003;
        return dp[start][end]=obj;
        
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
		    int n=sc.nextInt();
		    String s=sc.next();
		    Pair dp[][]=new Pair[n][n];
		    
		    System.out.println(func(s,0,n-1,dp).x1);
		}
	}
}
