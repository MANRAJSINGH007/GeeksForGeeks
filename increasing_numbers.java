
public class Solution {
	
    
    public static void func(int curr, int n, int prev, String ans){
        
        if(curr==n){
            System.out.print(ans+" ");
            return ;
        }
        
        for(int k=prev+1;k<=9;k++){
            func(curr+1,n,k,ans+Integer.toString(k));
        }
        
        return ;
        
    }
    
    
	public static void printIncreasingNumber(int n) {
		/* Your class should be named Solution.
		 * Don't write main() function.
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question
		*/
        
        func(0,n,0,"");
        return ;

	}
}
