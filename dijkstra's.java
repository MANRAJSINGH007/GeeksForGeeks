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
      
      for(int i=1;i<=e;i++)
      {
        int sv=sc.nextInt();
        int ev=sc.nextInt();
        int weight=sc.nextInt();
        edges[sv][ev]=weight;
        edges[ev][sv]=weight;
        
      }
      
      
      boolean visited[]=new boolean[n];
      int distance[]=new int[n];
      
      for(int i=1;i<n;i++)
      {
        distance[i]=Integer.MAX_VALUE;
        
      }
      
      
      for(int i=1;i<=n;i++)
      {
        int min=Integer.MAX_VALUE;
        int vertex=n;
        for(int k=0;k<n;k++)
        {
          if(!visited[k] && distance[k]<min)
          {
            min=distance[k];
            vertex=k;
            
          }
          
        }
        
        
        visited[vertex]=true;
        
        for(int k=1;k<n;k++)
        {
          if(edges[vertex][k]!=0 && !visited[k] && distance[vertex]+edges[vertex][k]<distance[k])
          {
            distance[k]=distance[vertex]+edges[vertex][k];
            
          }
        }
        
      }
      
      for(int i=0;i<n;i++)
      {
        System.out.println(i+" "+distance[i]);

      }
      
      
      
	}
}
