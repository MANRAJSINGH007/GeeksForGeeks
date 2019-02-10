
public class solution {
	
  	public static boolean function(String[] arr, int n, int m, int i, int j, int sx, int sy, boolean[][] visited, int curr)
    {
      if(curr>=4 && i==sx && j==sy)
      {
        return true;
      }
      
      if(i<0 || j<0 || i>=n || j>=m || visited[i][j] || arr[i].charAt(j)!=arr[sx].charAt(sy))
      {
        return false;
        
      }
      
      visited[i][j]=true;
      
      boolean b1=function(arr,n,m,i+1,j,sx,sy,visited,curr+1);
      if(b1)
      {
        return true;
      }
      b1=function(arr,n,m,i-1,j,sx,sy,visited,curr+1);
      if(b1)
      {
        return true;
      }
      b1=function(arr,n,m,i,j+1,sx,sy,visited,curr+1);
      if(b1)
      {
        return true;
      }
      b1=function(arr,n,m,i,j-1,sx,sy,visited,curr+1);
      if(b1)
      {
        return true;
      }
      
      return visited[i][j]=false;
      
    }
  	
	int solve(String[] arr , int n, int m)
	{
		// Write your code here.
      boolean visited[][]=new boolean[n][m];
      
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
          if(function(arr,n,m,i,j,i,j,visited,1))
          {
            return 1;
          }
        }
      }
      
      return 0;

	}	
}
