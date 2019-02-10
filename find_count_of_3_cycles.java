public class solution{
  
    public int solve(int n,int m,int U[],int V[]) {
        //write your code here
      int edges[][]=new int[n+1][n+1];
      for(int i=0;i<m;i++)
      {
        int sv=U[i];
        int ev=V[i];
        edges[sv][ev]=1;
        edges[ev][sv]=1;
        
      }
      	
  	  int count=0;
  		
  	  for(int i=1;i<=n;i++)
      {
        int sv=i;
        for(int j=1;j<=n;j++)
        {
          if(j==i)
            continue;
          
          if(edges[sv][j]==1)
          {
            for(int k=1;k<=n;k++)
            {
              if(k==j || k==sv)
               continue;
              
              if(edges[j][k]==1 && edges[k][sv]==1)
                count++;
              
              
            }
          }
        }
      }
  
  	  return count/6;
      
      
    }
}
