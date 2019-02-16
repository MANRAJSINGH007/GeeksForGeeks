import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
    {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
           String str=sc.next();
           String x=sc.next();
           
           int n=str.length();
           int m=x.length();
           if(n<m)
           {
               System.out.println(0);
               continue;
               
           }
           
           
           int arr[]=new int[26];
           int brr[]=new int[26];
           
           for(int i=0;i<m;i++)
           {
               char ch=str.charAt(i);
               arr[(int)ch-97]++;
               
               char present=x.charAt(i);
               brr[(int)present-97]++;
               
           }
           
           int flag=0;
           
           for(int i=0;i<26;i++)
           {
               if(arr[i]!=brr[i])
               {
                   flag=1;
                   break;
               }
           }
           
           int count=0;
           
           if(flag==0)
           {
               count++;
           }
          
         
           for(int i=m;i<n;i++)
           {
               char curr=str.charAt(i);
               char prev=str.charAt(i-m);
               arr[(int)prev-97]--;
               arr[(int)curr-97]++;
               
               flag=0;
           
               for(int k=0;k<26;k++)
               {
                   if(arr[k]!=brr[k])
                   {
                       
                       flag=1;
                       break;
                   }
               }
               
               if(flag==0)
               {
                   count++;
               }
                   
                   
           }
           
           System.out.println(count);
           
           
        }
    }
}
