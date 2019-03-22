public class solution {

	public static void spiralPrint(int matrix[][]){
		// Write your code here
        int n=matrix.length;
        int m=matrix[0].length;
        
        int r1=0;
        int c1=0;
        int r2=n-1;
        int c2=m-1;
        
        while(r1<r2 && c1<c2){
            
            for(int i=c1;i<=c2;i++){
                System.out.print(matrix[r1][i]+" ");
            }
            
            r1++;
            
            for(int i=r1;i<=r2;i++){
                System.out.print(matrix[i][c2]+" ");
            }
            
            c2--;
            
            for(int i=c2;i>=c1;i--){
                System.out.print(matrix[r2][i]+" ");
            }
            
            r2--;
            
            for(int i=r2;i>=r1;i--){
                System.out.print(matrix[i][c1]+" ");
            }
            
            c1++;
        }
        
        return ;

	}
}
