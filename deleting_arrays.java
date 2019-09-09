import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {   String[] arr_ =  br.readLine().split(" ");
            int Array[] = new int[2];
            for(int i=0;i<2;i++){
                  Array[i] = Integer.parseInt(arr_[i]);
            }
            int N = Array[0];
            int q = Array[1];
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            
            for(int i_A=0; i_A<arr_A.length; i_A++)
            {
            	A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
          
            String[] arr_query = br.readLine().split(" ");
            int[] query = new int[q];
            for(int i_query=0; i_query<arr_query.length; i_query++)
            {
            	query[i_query] = Integer.parseInt(arr_query[i_query]);
            }
            
            int[] out_ = final_arr(A, query, q, N);
            System.out.print(out_[0]);
            for(int i_out_=1; i_out_<out_.length; i_out_++)
            {
            	System.out.print(" " + out_[i_out_]);
            }
            System.out.println("");
         }
 
         wr.close();
         br.close();
    }
    static int[] final_arr(int[] arr, int[] query, int q, int n){
        // Write your code here
        
        if(q == 0){
            return arr;
        }
        
        Arrays.sort(query);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(query[0]);
        
        for(int i = 1; i < q; i++){
            int prev_index = list.get(list.size() - 1);
            int prev_element = arr[prev_index];
            int curr_index = query[i];
            int curr_element = arr[curr_index];
            if(curr_element > prev_element){
                list.add(curr_index);
            }
        }
        
        if(list.size() == 1){
            int index = list.get(0);
            for(int i = index + 1; i < n; i++){
                if(arr[i] < arr[index]){
                    arr[i] = 0;
                }
            }
            
            return arr;
        }
        
        
        for(int i = 0; i < list.size() - 1; i++){
            int index1 = list.get(i);
            int index2 = list.get(i + 1);
            for(int j = index1 + 1; j < index2; j++){
                if(arr[j] < arr[index1]){
                    arr[j] = 0;
                }
            }
        }
        
        int index = list.get(list.size() - 1);
        for(int i = index + 1; i < n; i++){
            if(arr[i] < arr[index]){
                arr[i] = 0;
            }
        }
        
        return arr;
    }
}
