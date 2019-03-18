public class ArrayEquilibrium{	
	//arr is the given array in which you need to find the equilibrium index
	public static int arrayEquilibrium(int[] arr){  
		//write your code here
        int sum=0;
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        
        int s=0;
        
        for(int i=0;i<n;i++){
            sum-=arr[i];
            if(sum==s){
                return i;
            }
            
            s+=arr[i];
            
        }
        
        return -1;
	}
}
