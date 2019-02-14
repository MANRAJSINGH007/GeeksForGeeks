import java.util.Scanner;
import java.util.Arrays;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int arr[]=new int[n];
      
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      
      Arrays.sort(arr);
      
      int currMin=arr[n-1]-arr[0];
      
      int small=arr[0]+k;
      
      int big=arr[n-1]-k;
      
      if(small>big)
      {
        int temp=small;
        small=big;
        big=temp;
        
      }
      
      
      for(int i=1;i<n-1;i++)
      {
        int sub=arr[i]-k;
        int add=arr[i]+k;
        
        if(sub>=small && sub<=big || add>=small && add<=big)
        {
          
        }
        
        else
        {
          int diff1=small-sub;
          int diff2=add-big;
          if(add-small<=big-sub)
          {
            big=add;
            
          }
          else
          {
            small=sub;
            
          }
          
        }
        
      }
      
      System.out.println(Math.min(currMin,big-small));
      

	}

}
