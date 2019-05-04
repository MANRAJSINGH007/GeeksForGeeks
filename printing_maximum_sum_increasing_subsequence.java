import java.util.*;
import java.lang.*;
import java.io.*;

class Pair{
    
    int sum;
    ArrayList<Integer> list;
    Pair(int sum, ArrayList<Integer> list){
        this.sum=sum;
        this.list=list;
    }
    
}

class GFG
 {
    public static Pair func(int[] arr, int n, int i, int prev, Pair[][] dp){
        
        if(i==n){
            return new Pair(0,new ArrayList<>());
        }
        
        if(prev!=-1){
            if(dp[i][prev]!=null){
                return dp[i][prev];
            }
        }
        
        Pair obj1=new Pair(0,new ArrayList<>());
        Pair obj2=func(arr,n,i+1,prev,dp);
        
        if(prev==-1 || arr[i]>arr[prev]){
            
            Pair small=func(arr,n,i+1,i,dp);
            obj1.sum=small.sum+arr[i];
            obj1.list=new ArrayList<Integer>();
            for(int k=0;k<small.list.size();k++){
            	obj1.list.add(small.list.get(k));
            }
            obj1.list.add(0,arr[i]);
        }
        
        if(obj1.sum>=obj2.sum){
            
            Pair ans=new Pair(0,new ArrayList<>());
        	ans.list=obj1.list;
        	ans.sum=obj1.sum;
        	
        	if(prev!=-1){
        		return dp[i][prev]=ans;
        	}
        	
        	return ans;
           
        }
        
        Pair ans=new Pair(0,new ArrayList<>());
    	ans.list=obj2.list;
    	ans.sum=obj2.sum;
    	
    	if(prev!=-1){
    		return dp[i][prev]=ans;
    	}
    	
    	return ans;
        
    }
     
	public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            Pair dp[][]=new Pair[n][n];
            
            Pair ans=func(arr,n,0,-1,dp);
            ArrayList<Integer> list=ans.list;
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
            
            System.out.println();
        }
    }
}
