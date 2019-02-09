import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static void func(int[] arr, int n)
     {
         if(n%2==0)
         {
             int i=(n/2)-1;
             int j=n/2;
             int mid=i;
             
             while(i>=0 && j<=n-1)
             {
                 if(arr[i]==arr[j])
                 {
                     i--;
                     j++;
                 }
                 else
                 {
                     break;
                 }
             }
             
             if(i<0)
             {
                 // it was already a palindrome.
                 if(arr[mid]!=9)
                 {
                    arr[mid]++;
                    arr[mid+1]++;
                    for(int p=0;p<n;p++)
                    {
                        System.out.print(arr[p]+" ");
                    }
                    
                    return ;
                     
                 }
                 else
                 {
                    arr[mid]=0;
                    i=mid-1;
                    while(i>=0 && arr[i]==9)
                    {
                        arr[i]=0;
                        i--;
                    }
                    
                    if(i<0)
                    {
                        System.out.print(1+" ");
                        for(int p=0;p<n-1;p++)
                        {
                            System.out.print(0+" ");
                        }
                        System.out.print(1);
                        return ;
                    }
                    else
                    {
                        arr[i]++;
                        
                        int t1=mid;
                        int t2=mid+1;
                        while(t1>=0)
                        {
                            arr[t2]=arr[t1];
                            t1--;
                            t2++;
                            
                        }
                        
                        for(int p=0;p<n;p++)
                        {
                            System.out.print(arr[p]+" ");
                        }
                        
                        return ;
                    }
                 }
             }
             
             else
             {
                 if(arr[i]>arr[j])
                 {
                     while(i>=0 && j<=n-1)
                     {
                         arr[j]=arr[i];
                         i--;
                         j++;
                     }
                     
                    for(int p=0;p<n;p++)
                    {
                        System.out.print(arr[p]+" ");
                    }
                    
                    return ;
                    
                 }
                 else
                 {
                     if(arr[mid]!=9)
                     {
                         arr[mid]++;
                         i=mid;
                         j=mid+1;
                         
                         while(i>=0 && j<=n-1)
                         {
                             arr[j]=arr[i];
                             i--;
                             j++;
                         }
                         
                        for(int p=0;p<n;p++)
                        {
                            System.out.print(arr[p]+" ");
                        }
                        
                        return ;
                         
                     }
                     
                     else
                     {
                        arr[mid]=0;
                        i=mid-1;
                        while(i>=0 && arr[i]==9)
                        {
                            arr[i]=0;
                            i--;
                        }
                        
                        if(i<0)
                        {
                            System.out.print(1+" ");
                            for(int p=0;p<n-1;p++)
                            {
                                System.out.print(0+" ");
                            }
                            System.out.print(1);
                            return ;
                        }
                        else
                        {
                            arr[i]++;
                            
                            int t1=mid;
                            int t2=mid+1;
                            while(t1>=0)
                            {
                                arr[t2]=arr[t1];
                                t1--;
                                t2++;
                                
                            }
                            
                            for(int p=0;p<n;p++)
                            {
                                System.out.print(arr[p]+" ");
                            }
                            
                            return ;
                        }
                     }
                 }
             }
         }
         else
         {
             int mid=n/2;
             int i=mid-1;
             int j=mid+1;
             while(i>=0 && j<=n-1)
             {
                 if(arr[i]==arr[j])
                 {
                     i--;
                     j++;
                 }
                 else
                 {
                     break;
                 }
             }
             
             if(i<0)
             {
                 // it was already a palindrome.
                 if(arr[mid]!=9)
                 {
                    arr[mid]++;
                    for(int p=0;p<n;p++)
                    {
                        System.out.print(arr[p]+" ");
                    }
                    
                    return ;
                     
                 }
                 else
                 {
                    arr[mid]=0;
                    i=mid-1;
                    while(i>=0 && arr[i]==9)
                    {
                        arr[i]=0;
                        i--;
                    }
                    
                    if(i<0)
                    {
                        System.out.print(1+" ");
                        for(int p=0;p<n-1;p++)
                        {
                            System.out.print(0+" ");
                        }
                        System.out.print(1);
                        return ;
                    }
                    else
                    {
                        arr[i]++;
                        
                        int t1=mid-1;
                        int t2=mid+1;
                        while(t1>=0)
                        {
                            arr[t2]=arr[t1];
                            t1--;
                            t2++;
                            
                        }
                        
                        for(int p=0;p<n;p++)
                        {
                            System.out.print(arr[p]+" ");
                        }
                        
                        return ;
                    }
                 }
             }
             
             else
             {
                 if(arr[i]>arr[j])
                 {
                     while(i>=0 && j<=n-1)
                     {
                         arr[j]=arr[i];
                         i--;
                         j++;
                     }
                     
                    for(int p=0;p<n;p++)
                    {
                        System.out.print(arr[p]+" ");
                    }
                    
                    return ;
                    
                 }
                 else
                 {
                     if(arr[mid]!=9)
                     {
                         arr[mid]++;
                         i=mid-1;
                         j=mid+1;
                         
                         while(i>=0 && j<=n-1)
                         {
                             arr[j]=arr[i];
                             i--;
                             j++;
                         }
                         
                        for(int p=0;p<n;p++)
                        {
                            System.out.print(arr[p]+" ");
                        }
                        
                        return ;
                         
                     }
                     
                     else
                     {
                        arr[mid]=0;
                        i=mid-1;
                        while(i>=0 && arr[i]==9)
                        {
                            arr[i]=0;
                            i--;
                        }
                        
                        if(i<0)
                        {
                            System.out.print(1+" ");
                            for(int p=0;p<n-1;p++)
                            {
                                System.out.print(0+" ");
                            }
                            System.out.print(1);
                            return ;
                        }
                        else
                        {
                            arr[i]++;
                            
                            int t1=mid-1;
                            int t2=mid+1;
                            while(t1>=0)
                            {
                                arr[t2]=arr[t1];
                                t1--;
                                t2++;
                                
                            }
                            
                            for(int p=0;p<n;p++)
                            {
                                System.out.print(arr[p]+" ");
                            }
                            
                            return ;
                        }
                     }
                 }
             }
             
             
         }
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
            
            func(arr,n);
            System.out.println();
            
        }
    }
}
