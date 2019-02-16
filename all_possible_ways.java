public class Solution {
  
   public static int function(int x, int y, int j, int[][] dp){
     
     if(x==0){
       
       return 1;
       
     }
     
     if(dp[x][j]!=-1){
       
       return dp[x][j];
       
     }
     
     int ways=0;
     
     for(int i=j; ;i++){
       
       int number=(int)Math.pow(i,y);
       if(number>x){
         
         break;
         
       }
       
       ways+=function(x-number,y,i+1,dp);
       
     }
     
     
     return dp[x][j]=ways;
     
     
   }
  	
   public static int allWays(int x, int y) {
	   /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
     
     int i=0;
     while((int)Math.pow(i,y)<=x){
       i++;
       
     }
     
     int dp[][]=new int[x+1][i+1];
     
     for(int p=0;p<=x;p++){
       
       for(int j=0;j<=i;j++){
         
         dp[p][j]=-1;
         
       }
       
     }
     
     return function(x,y,1,dp);
	   
    }
}
