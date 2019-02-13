class GfG
{
    // The task is to complete this function
    int getId(int arr[][], int n)
    {
        // Your code here
        
        Stack<Integer> stack=new Stack<Integer>();
        
        for(int i=0;i<n;i++)
        {
            stack.push(i);
            
        }
        
        while(stack.size()>1)
        {
            int a=stack.pop();
            int b=stack.pop();
            
            if(arr[a][b]==1)
                stack.push(b);
                
            else
                stack.push(a);
                
        }
        
        int j=stack.pop();
        
        for(int i=0;i<n;i++)
        {
            if(i!=j && (arr[j][i]==1 || arr[i][j]==0))
            {
                return -1;
            }
            
        }
        
        return j;
        
    }
}
