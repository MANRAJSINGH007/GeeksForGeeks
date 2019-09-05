class GfG
{
    public static int sum(Tree root, int curr){
        
        if(root == null){
            return 0;
        }
        
        if(root.left == null && root.right == null){
            return (curr * 10 + root.data);
        }
        
        return sum(root.left, curr * 10 + root.data) + sum(root.right, curr * 10 + root.data);
        
    }
    
	public static int treePathsSum(Tree root){
         //add code here.
         return sum(root, 0);
	}
}
