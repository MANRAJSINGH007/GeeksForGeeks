import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{
    
    public static void func(int[] arr, int start, int end){
        
        if(start==end){
            System.out.print(arr[start]+" ");
            return ;
        }
        
        int root=arr[start];
        
        int index=-1;
        
        for(int i=start+1;i<=end;i++){
            if(arr[i]>root){
                index=i;
                break;
            }
        }
        
        if(index==-1){
            func(arr,start+1,end);
        }
        else{
            if(index!=start+1)
                func(arr,start+1,index-1);
            
            func(arr,index,end);
        }
        
        System.out.print(root+" ");
        
        return ;
        
    }
    
	public static void main (String[] args){
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            func(arr,0,n-1);
            System.out.println();
        }
    }
}
