class GfG{
    
    public static ArrayList<String> func(int n, int i, int j, int[][] path){
        
        if(i<0 || j<0 || i==n || j==n || path[i][j]==0){
            return null;
        }
        
        if(i==n-1 && j==n-1){
            ArrayList<String> temp=new ArrayList<>();
            temp.add("");
            return temp;
        }
        
        path[i][j]=0;
        
        ArrayList<String> ans=new ArrayList<>();
        
        ArrayList<String> temp1=func(n,i+1,j,path);
        ArrayList<String> temp2=func(n,i-1,j,path);
        ArrayList<String> temp3=func(n,i,j+1,path);
        ArrayList<String> temp4=func(n,i,j-1,path);
        
        if(temp1!=null){
            
            for(int p=0;p<temp1.size();p++){
                String curr=temp1.get(p);
                String str="D"+curr;
                ans.add(str);
            }
        }
        
        if(temp2!=null){
            
            for(int p=0;p<temp2.size();p++){
                String curr=temp2.get(p);
                String str="U"+curr;
                ans.add(str);
            }
        }
        
        if(temp3!=null){
            
            for(int p=0;p<temp3.size();p++){
                String curr=temp3.get(p);
                String str="R"+curr;
                ans.add(str);
            }
        }
        
        if(temp4!=null){
            
            for(int p=0;p<temp4.size();p++){
                String curr=temp4.get(p);
                String str="L"+curr;
                ans.add(str);
            }
        }
        
        path[i][j]=1;
        
        if(ans.size()==0){
            return null;
        }

        return ans;
        
    }
    
    
    
    public static ArrayList<String> printPath(int[][] path, int n){
          //Your code here
          
          if(path[n-1][n-1]==0){
              return new ArrayList<>();
          }
          
          ArrayList<String> ans=func(n,0,0,path);
          
          Collections.sort(ans);
          
          if(ans==null){
              return new ArrayList<>();
          }
          
          return ans;
          
    }
}
