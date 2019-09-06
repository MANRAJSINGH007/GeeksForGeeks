import java.util.*;
import java.lang.*;
import java.io.*;

class Pair{
    int node;
    int connection;
    
    Pair(int node, int connection){
        this.node = node;
        this.connection = connection;
    }
}

class GFG{

	public static void main (String[] args){
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int j = 0; j < t; j++){
        
            int n = sc.nextInt();
            
            HashMap<Integer, Integer> map = new HashMap<>();
            
            for(int i = 2; i <= n; i++){
                map.put(i, sc.nextInt());
            }
            
            for(int i = 2; i <= n; i++){
                int curr = i;
                int count = 0;
                Stack<Pair> stack = new Stack<>();
                while(map.containsKey(curr)){
                    curr = map.get(curr);
                    count += 1;
                    stack.push(new Pair(curr, count));
                }
                
                while(stack.size() > 0){
                    Pair obj = stack.pop();
                    System.out.print(i+" "+obj.node+" "+obj.connection+" ");
                }
            }
            
            System.out.println();
            
        }
    }
}
