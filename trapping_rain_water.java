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
            
            int water=0;
            int leftMax=0;
            int rightMax=0;
            
            int left=0;
            int right=n-1;
            
            while(left<=right)
            {
                leftMax=Math.max(arr[left],leftMax);
                rightMax=Math.max(arr[right],rightMax);
                int amount=Math.min(leftMax,rightMax);
                
                if(arr[left]<arr[right])
                {
                    if(arr[left]<amount)
                    {
                        water+=amount-arr[left];
                    }
                    
                    left++;
                }
                
                else
                {
                    if(arr[right]<amount)
                    {
                        water+=amount-arr[right];
                    }
                    
                    right--;
                }
                
            }
            
            System.out.println(water);
            
            
        }
    }
}
