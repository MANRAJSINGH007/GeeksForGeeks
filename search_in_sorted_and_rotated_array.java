import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int func(int[] arr, int n, int x)
    {
        int start=0;
        int end=n-1;
        int mid=(start+end)/2;
        
        while(start<end)
        {
            mid=(start+end)/2;
            
            if(arr[mid]==x)
            {
                return mid;
            }
            
            
            if(arr[mid]>=arr[start])
            {
                if(x>arr[mid] || x<arr[start])
                {
                    start=mid+1;
                }
                
                else
                {
                    end=mid-1;
                }
            }
            
            else
            {
                if(x>=arr[start] || x<arr[mid])
                {
                    end=mid-1;
                }
                
                else
                {
                    start=mid+1;
                }
            }
            
        }
        
        if(start==end)
        {
            if(arr[start]==x)
            {
                return start;
            }
        }
        
        return -1;
        
        
    }
	  public static void main (String[] args) throws IOException
    {
        //code
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int j=0;j<t;j++)
        {
            int n=Integer.parseInt(br.readLine());
            String s[]=br.readLine().trim().split(" ");
            
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(s[i]);
            }
            
            int x=Integer.parseInt(br.readLine());
            
            System.out.println(func(arr,n,x));
            
        }
    }
}
