public class solution {
    
  	public static boolean check(int[] aux, int[] brr){
      
      for(int i=0;i<256;i++){
        
        if(aux[i]>brr[i]){
          
          return false;
          
        }
        
      }
      
      return true;
      
    }
  
  
    public static String findMinSubstringContainingString(String large, String small){
        /* Your class should be named solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
      
      int n=large.length();
      int m=small.length();
      
      if(n<m){
        
        return null;
        
      }
      
      int aux[]=new int[256];
      int brr[]=new int[256];
      
      for(int i=0;i<m;i++){
        
        char ch=small.charAt(i);
        aux[(int)ch]++;
        
        char present=large.charAt(i);
        brr[(int)present]++;
        
      }
      
      int min=Integer.MAX_VALUE;
      int left=-1;
      int right=-1;
      
      int start=0;
      int end=m-1;
      
      while(start<=n-m){
        
        if(check(aux,brr)){
          
          int currMin=end-start+1;
          if(currMin<min){
            
            //System.out.println(currMin);
            min=currMin;
            left=start;
            right=end;
            
          }
          
          brr[(int)large.charAt(start)]--;
          start++;
          
        }
        
        else if(end<n-1){
          
          end++;
          brr[(int)large.charAt(end)]++;
          
        }
        
        else{
          
          break;
          
        }
        
      }
      
      if(min!=Integer.MAX_VALUE){
        
        return large.substring(left,right+1);
        
      }
      
      return null;
        
    }
}
