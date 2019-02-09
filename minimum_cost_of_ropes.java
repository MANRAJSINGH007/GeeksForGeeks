import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
            int cost=0;
            
            for(int i=0;i<n;i++)
            {
                pq.add(sc.nextInt());
            }
            
            while(pq.size()>=2)
            {
                int first=pq.remove();
                int second=pq.remove();
                cost+=first+second;
                pq.add(first+second);
                
            }
            
            System.out.println(cost);
            
        }
    }
}
