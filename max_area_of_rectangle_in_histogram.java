import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            long arr[]=new long[n];
            int ans1[]=new int[n];
            int ans2[]=new int[n];
            
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextLong();
            }
            
            Stack<Integer> stack=new Stack<Integer>();
            
            stack.push(0);
            ans1[0]=1;
            
            for(int i=1;i<n;i++)
            {
                long curr=arr[i];
                int smallAns=1;
                while(stack.size()>0 && arr[stack.peek()]>=curr)
                {
                    smallAns+=ans1[stack.pop()];
                    
                }
                
                ans1[i]=smallAns;
                stack.push(i);
                
            }
            
            stack.clear();
            
            stack.push(n-1);
            
            ans2[n-1]=1;
            
            for(int i=n-2;i>=0;i--)
            {
                long curr=arr[i];
                int smallAns=1;
                while(stack.size()>0 && arr[stack.peek()]>=curr)
                {
                    smallAns+=ans2[stack.pop()];
                    
                }
                
                ans2[i]=smallAns;
                stack.push(i);
                
            }
            
            long max=0;
            
            for(int i=0;i<n;i++)
            {
                int total=ans1[i]+ans2[i]-1;
                if(total*arr[i]>max)
                {
                    max=total*arr[i];
                }
            }
            
            System.out.println(max);
            
        }
    }
}
