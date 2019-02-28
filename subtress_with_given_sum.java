class GFG
{
    static int count=0;
    
    public static int func(Node root, int x){
        
        if(root==null){
            return 0;
        }
        
        int sum1=func(root.left,x);
        int sum2=func(root.right,x);
        
        if(sum1+sum2+root.data==x){
            count++;
        }
        
        return root.data+sum1+sum2;
        
    }
    
    int countSubtreesWithSumX(Node root, int x)
    {
        count=0;
        int dummy_sum=func(root,x);
        
        return count;
	
    }
}
