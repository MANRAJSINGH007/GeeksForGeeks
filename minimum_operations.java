import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{

	public static void main (String[] args){
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            
            int n=sc.nextInt();
            int count=0;
            
            while(n>0){
                if(n%2==0){
                    n/=2;
                }
                else{
                    n--;
                }
                count++;
            }
            
            System.out.println(count);
            
        }
    }
}
