
public class Solution {
	
	
	
	public static int longestBitonicSubarray(int[] arr){

	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
      
      int n=arr.length;
      
      int inc[]=new int[n];
      int dec[]=new int[n];
      
      for(int i=0;i<n;i++)
      {
        inc[i]=1;
      }
      
      for(int i=1;i<n;i++)
      {
        for(int j=0;j<i;j++)
        {
          if(arr[j]<arr[i] && inc[i]<inc[j]+1)
          {
            inc[i]=inc[j]+1;
            
          }
        }
      }
      
      
      for(int i=n-2;i>=0;i--)
      {
        for(int j=n-1;j>i;j--)
        {
          if(arr[j]<arr[i] && dec[j]+1>dec[i])
          {
            dec[i]=dec[j]+1;
            
          }
          
        }
        
      }
      
      int max=1;
      for(int i=0;i<n;i++)
      {
        if(dec[i]+inc[i]>max)
        {
          max=dec[i]+inc[i];
          
        }
        
      }
      
      return max;
		
	}
	
}
