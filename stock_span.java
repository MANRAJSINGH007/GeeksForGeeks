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
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            int ans[]=new int[n];
            
            Stack<Integer> stack=new Stack<Integer>();
            
            stack.push(0);
            ans[0]=1;
            
            for(int i=1;i<n;i++)
            {
                int curr=arr[i];
                int smallAns=1;
                while(stack.size()>0 && arr[stack.peek()]<=curr)
                {
                    int index=stack.pop();
                    smallAns+=ans[index];
                    
                }
                
                stack.push(i);
                ans[i]=smallAns;
                
            }
            
            
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            
            System.out.println();
            
        }
    }
}
