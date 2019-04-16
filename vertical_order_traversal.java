import java.util.*;

public class Solution {

    public static void func(BinaryTreeNode<Integer> root, int x, HashMap<Integer,ArrayList<Integer>> map){
        
        if(root==null){
            return ;
        }
    
        if(!map.containsKey(x)){
            ArrayList<Integer> curr=new ArrayList<Integer>();
            curr.add(root.data);
            map.put(x,curr);
        }
        
        else{
            
            ArrayList<Integer> curr= map.get(x);
            curr.add(root.data);
        }
        
        func(root.left,x-1,map);
        func(root.right,x+1,map);
        
    }

	public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root){
        
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<Integer,ArrayList<Integer>>();
        func(root,0,map);
        Set<Integer> keys=map.keySet();
        for(Integer i : keys){
            
            ArrayList<Integer> curr=map.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
                
            }
            
            System.out.println();
        }
        
		
	}



}
