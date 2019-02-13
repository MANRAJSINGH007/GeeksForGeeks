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
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextLong();
            }
            
            
            long ans[]=new long[n];
            
            
            Stack<Long> stack=new Stack<Long>();
            
            stack.push(arr[n-1]);
            
            // System.out.print(-1+" ");
            ans[n-1]=-1;
            
            for(int i=n-2;i>=0;i--)
            {
                long curr=arr[i];
                while(stack.size()>0 && stack.peek()<curr)
                {
                    long waste=stack.pop();
                    
                }
                
                if(stack.size()==0)
                {
                    // System.out.print(-1+" ");
                    ans[i]=-1;
                    
                }
                else
                    ans[i]=stack.peek();
                    
                stack.push(curr);
                
            }
            
            
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
                
            }
            
            System.out.println();
            
        }
    }
}
