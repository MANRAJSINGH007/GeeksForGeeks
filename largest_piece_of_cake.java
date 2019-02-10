public class solution {
  
    public static int dfs(int[][] arr, int i, int j, int n)
    {
      if(i<0 || j<0 || i==n || j==n || arr[i][j]==0)
      {
        return 0;
      }
      
      int ans=1;
      arr[i][j]=0;
      
      int m1=dfs(arr,i+1,j,n);
      int m2=dfs(arr,i-1,j,n);
      
      int m3=dfs(arr,i,j+1,n);
      int m4=dfs(arr,i,j-1,n);
      
      return ans+m1+m2+m3+m4;
      
    }
  
    public int solve(int n,String cake[]) {
        //write your code here
      
      int arr[][]=new int[n][n];
      
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(cake[i].charAt(j)=='1')
          {
            arr[i][j]=1;
          }
          else
          {
            arr[i][j]=0;
          }
        }
      }
      
      int max=0;
      
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          int small=dfs(arr,i,j,n);
          if(small>max)
          {
            max=small;
          }
        }
      }
      
      return max;
      
      
    }
}
