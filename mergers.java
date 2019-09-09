import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String A = br.readLine();
            String B = br.readLine();
 
            int out_ = solve(A, B);
            System.out.println(out_);
         }
 
         wr.close();
         br.close();
    }
    
    public static int find(String a, String b){
        
        int n = a.length();
        int m = b.length();
        
        int min = n + m;
        
        for(int i = 0; i < n; i++){
            char curr = a.charAt(i);
            if(b.charAt(0) == curr){
                int i1 = i;
                int i2 = 0;
                int local_max = 0;
                while(i1 < n && i2 < m && a.charAt(i1) == b.charAt(i2)){
                    local_max++;
                    i1++;
                    i2++;
                }
                
                if(i1 == n){
                    min = Math.min(min, n + m - local_max);
                }
            }
        }
        
        for(int i = n - 1; i >= 0; i--){
            char curr = a.charAt(i);
            if(b.charAt(0) == curr){
                int i1 = i;
                int i2 = 0;
                int local_max = 0;
                while(i1 >= 0 && i2 < m && a.charAt(i1) == b.charAt(i2)){
                    local_max++;
                    i1--;
                    i2++;
                }
                
                if(i1 == -1){
                    min = Math.min(min, n + m - local_max);
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            char curr = a.charAt(i);
            if(b.charAt(m - 1) == curr){
                int i1 = i;
                int i2 = m - 1;
                int local_max = 0;
                while(i1 < n && i2 >= 0 && a.charAt(i1) == b.charAt(i2)){
                    local_max++;
                    i1++;
                    i2--;
                }
                
                if(i1 == n){
                    min = Math.min(min, n + m - local_max);
                }
            }
        }
        
        return min;
    }
    
    static int solve(String s1, String s2){
        // Write your code here
        
        return find(s1, s2);
        
    }
}
