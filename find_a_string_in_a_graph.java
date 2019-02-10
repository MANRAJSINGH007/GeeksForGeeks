
public class solution {
	
  	public static boolean find(String[] arr, int n, int m, int i, int j, String ans, int index, int len, boolean[][] visited)
    {
      if(index==len)
      {
        return true;
        
      }
      
      if(i<0 || i==n || j<0 || j>=arr[i].length() || visited[i][j] || ans.charAt(index)!=arr[i].charAt(j))
      {
        return false;
        
      }
      
      visited[i][j]=true;
      
      boolean b1=find(arr,n,m,i+1,j,ans,index+1,len,visited);
      if(b1)
      {
        return true;
      }
      boolean b2=find(arr,n,m,i-1,j,ans,index+1,len,visited);
      if(b2)
      {
        return true;
      }
      boolean b3=find(arr,n,m,i,j+1,ans,index+1,len,visited);
      if(b3)
      {
        return true;
      }
      boolean b4=find(arr,n,m,i,j-1,ans,index+1,len,visited);
      if(b4)
      {
        return true;
      }
      boolean b5=find(arr,n,m,i-1,j-1,ans,index+1,len,visited);
      if(b5)
      {
        return true;
      }
      boolean b6=find(arr,n,m,i+1,j+1,ans,index+1,len,visited);
      if(b6)
      {
        return true;
      }
      boolean b7=find(arr,n,m,i+1,j-1,ans,index+1,len,visited);
      if(b7)
      {
        return true;
      }
      boolean b8=find(arr,n,m,i-1,j+1,ans,index+1,len,visited);
      if(b8)
      {
        return true;
      }

      visited[i][j]=false;
      
      return false;
      
    }
  
  
	int solve(String[] arr, int n, int m)
	{
		// Write your code here.
      String ans="CODING";
      int len=ans.length();
      int index=0;
      
      boolean visited[][]=new boolean[n][m];
      
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
          if(j<arr[i].length())
          {
            if(find(arr,n,m,i,j,ans,index,len,visited))
      			return 1;
          }
        }
      }
      
      
      
      return 0;
      
	}	
}
