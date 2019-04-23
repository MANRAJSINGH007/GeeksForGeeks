import java.util.ArrayList;

public class Solution {
	
    public static void func(int[] arr, int k, ArrayList<String> ans, String s){
        
        if(k==0){
            ans.add(s);
            return ;
        }
        
        for(int i=0;i<256;i++){
            
            if(arr[i]!=0){
                func(arr,k-1,ans,s+Character.toString((char)i));
            }
            
        }
        
        return ;
        
        
    }
    
	public static String[] allStrings(String str, int k){
		
		// Write your code here 
        int arr[]=new int[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            arr[(int)ch]++;
        }
        
        ArrayList<String> list=new ArrayList<String>();
        func(arr,k,list,"");
        String ans[]=new String[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        
        return ans;

	}
 	
}
