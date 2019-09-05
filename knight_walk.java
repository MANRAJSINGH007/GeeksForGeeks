import java.util.*;
import java.lang.*;
import java.io.*;

class Pair{
    int x;
    int y;
    int ans;
    
    Pair(int x, int y, int ans){
        this.x = x;
        this.y = y;
        this.ans = ans;
    }
}

class GFG{
    
    public static int calc(int n, int m, int s1, int s2, int d1, int d2){
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(s1, s2, 0));
        boolean[][] visited = new boolean[n + 1][m + 1];
        visited[s1][s2] = true;
        
        while(q.size() > 0){
            
            Pair curr = q.remove();
            
            if(curr.x == d1 && curr.y == d2){
                return curr.ans;
            }
            
            if(curr.x + 1 <= n && curr.y - 2 > 0 && !visited[curr.x + 1][curr.y - 2]){
                visited[curr.x + 1][curr.y - 2] = true;
                q.add(new Pair(curr.x + 1, curr.y - 2, curr.ans + 1));
            }
            
            if(curr.x - 1 > 0 && curr.y + 2 <= m && !visited[curr.x - 1][curr.y + 2]){
                visited[curr.x - 1][curr.y + 2] = true;
                q.add(new Pair(curr.x - 1, curr.y + 2, curr.ans + 1));
            }
            
            if(curr.x + 1 <= n && curr.y + 2 <= m && !visited[curr.x + 1][curr.y + 2]){
                visited[curr.x + 1][curr.y + 2] = true;
                q.add(new Pair(curr.x + 1, curr.y + 2, curr.ans + 1));
            }
            
            if(curr.x - 1 > 0 && curr.y - 2 > 0 && !visited[curr.x - 1][curr.y - 2]){
                visited[curr.x - 1][curr.y - 2] = true;
                q.add(new Pair(curr.x - 1, curr.y - 2, curr.ans + 1));
            }
            
            if(curr.x + 2 <= n && curr.y - 1 > 0 && !visited[curr.x + 2][curr.y - 1]){
                visited[curr.x + 2][curr.y - 1] = true;
                q.add(new Pair(curr.x + 2, curr.y - 1, curr.ans + 1));
            }
            
            if(curr.x - 2 > 0 && curr.y + 1 <= m && !visited[curr.x - 2][curr.y + 1]){
                visited[curr.x - 2][curr.y + 1] = true;
                q.add(new Pair(curr.x - 2, curr.y + 1, curr.ans + 1));
            }
            
            if(curr.x + 2 <= n && curr.y + 1 <= m && !visited[curr.x + 2][curr.y + 1]){
                visited[curr.x + 2][curr.y + 1] = true;
                q.add(new Pair(curr.x + 2, curr.y + 1, curr.ans + 1));
            }
            
            if(curr.x - 2 > 0 && curr.y - 1 > 0 && !visited[curr.x - 2][curr.y - 1]){
                visited[curr.x - 2][curr.y - 1] = true;
                q.add(new Pair(curr.x - 2, curr.y - 1, curr.ans + 1));
            }
            
        }
        
        return -1;
    }
    
    
	public static void main (String[] args){
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j < t; j++){
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            
            int d1 = sc.nextInt();
            int d2 = sc.nextInt();
            
            System.out.println(calc(n, m, s1, s2, d1, d2));
            
        }
    }
}
