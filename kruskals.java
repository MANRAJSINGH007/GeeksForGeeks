import java.util.*;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
	
  int source;
  int dest;
  int weight;
  
  public int compareTo(Edge o){
    
    return this.weight-o.weight;
  }
  
  
}
public class Solution {

  
  	public static int findParent(int v, int[] parent)
    {
      if(parent[v]==v)
      {
        return v;
      }
      
      return findParent(parent[v],parent);
      
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
      
      	Edge arr[]=new Edge[e];
      
      for(int i=0;i<e;i++)
      {
        arr[i]=new Edge();
        arr[i].source=sc.nextInt();
        arr[i].dest=sc.nextInt();
        arr[i].weight=sc.nextInt();
        
      }
      
      Arrays.sort(arr);
      
      Edge output[]=new Edge[n-1];
      int parent[]=new int[n];
      for(int i=0;i<n;i++)
      {
        parent[i]=i;
        
      }
      int count=0;
      int j=0;
      
      while(count!=n-1)
      {
        int sourceParent=findParent(arr[j].source,parent);
        int destParent=findParent(arr[j].dest,parent);
        
        if(sourceParent!=destParent)
        {
          output[count]=arr[j];
          count++;
          parent[sourceParent]=destParent;
          
        }
        
        j++;
        
      }
      
      
      for(int k=0;k<n-1;k++)
      {
        if(output[k].source<output[k].dest)
        {
          System.out.println(output[k].source+" "+output[k].dest+" "+output[k].weight);
          
        }
        else
        {
          System.out.println(output[k].dest+" "+output[k].source+" "+output[k].weight);

        }
      }
      	
      
      
      
	}
}
