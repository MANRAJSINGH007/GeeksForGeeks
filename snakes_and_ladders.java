import java.util.*;
import java.lang.*;
import java.io.*;
class Pair{
    int index;
    int ans;
    
    Pair(int index, int ans)
    {
        this.index=index;
        this.ans=ans;
    }
    
}
class GFG
 {
    public static int function(HashMap<Integer,Integer> map)
    {
        boolean[] visited=new boolean[31];
        visited[1]=true;
        Queue<Pair> q=new LinkedList<Pair>();
        
        q.add(new Pair(1,0));
        
        while(!q.isEmpty())
        {
            Pair p=q.remove();
            
            if(p.index==30)
            {
                return p.ans;
            }
            
            
            for(int i=1;i<=6;i++)
            {
                if(p.index+i<=30 && !visited[p.index+i])
                {
                    int small_ans=p.ans+1;
                    visited[p.index+i]=true;
                    if(map.containsKey(p.index+i))
                    {
                        int next=map.get(p.index+i);
                        visited[next]=true;
                        q.add(new Pair(next,p.ans+1));
                    }
                    else
                        q.add(new Pair(p.index+i,small_ans));
                    
                }
            }
        }
        
        return 0;
        
    }
	public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
            
            for(int i=0;i<n;i++)
            {
                int start=sc.nextInt();
                int end=sc.nextInt();
                map.put(start,end);
                
            }
            
            System.out.println(function(map));
        }
    }
}
