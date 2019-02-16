
public class Solution {
  
  	public static void printParenthesis(int n, int opening, int closing, String ans){
      
      if(closing==n){
        
        System.out.println(ans);
        return ;
        
      }
      
      if(opening==n){
        
        printParenthesis(n,opening,closing+1,ans+')');
        return ;
        
      }
      
      if(opening==closing){
        
        printParenthesis(n,opening+1,closing,ans+'(');
        return ;
        
      }
      
      
      printParenthesis(n,opening+1,closing,ans+'(');
      printParenthesis(n,opening,closing+1,ans+')');
      
      return ;
      
    }
	
	public static void printWellFormedParanthesis( int n){
		
		// Write your code here
      
      printParenthesis(n,0,0,"");
      
      return ;

	}
	
}
	

