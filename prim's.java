import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
      
      int edges[][]=new int[n][n];
      for(int i=0;i<e;i++)
      {
        int sv=sc.nextInt();
        int ev=sc.nextInt();
        int w=sc.nextInt();
        edges[sv][ev]=w;
        edges[ev][sv]=w;
        
      }
      
      boolean visited[]=new boolean[n];
      int parent[]=new int[n];
      int weight[]=new int[n];

      for(int i=0;i<n;i++)
      {
        parent[i]=-1;
        weight[i]=Integer.MAX_VALUE;
        
      }
      
      weight[0]=0;
      
      for(int i=1;i<=n;i++)
      {
        int min=Integer.MAX_VALUE;
        int vertex=n;
        
        for(int k=0;k<n;k++)
        {
          if(!visited[k] && weight[k]<min)
          {
            min=weight[k];
            vertex=k;
          }
          
        }
        
        visited[vertex]=true;
        
        for(int k=0;k<n;k++)
        {
          if(!visited[k] && edges[vertex][k]!=0 && edges[vertex][k]<weight[k])
          {
            weight[k]=edges[vertex][k];
            parent[k]=vertex;
            
          }
          
        }
        
        
      }
      
      for(int i=1;i<n;i++)
      {
        if(parent[i]<i)
        {
          System.out.println(parent[i]+" "+i+" "+weight[i]);
          
        }
        else
        {
          System.out.println(i+" "+parent[i]+" "+weight[i]);
          
        }
      }
      
      
	}
}
