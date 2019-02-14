#include <iostream>
using namespace std;

int main() {
        int t;
        cin>>t;
        
        for(int j=0;j<t;j++)
        {
            int n;
            cin>>n;
            long k;
            cin>>k;
            
            long arr[n];
            int count=0;
            
            for(int i=0;i<n;i++)
            {
                cin>>arr[i];
            }
            
            long prod=1;
            
            for(int start=0, end=0; end<n;end++)
            {
                prod*=arr[end];
                
                while(start<=end && prod>=k)
                {
                    prod/=arr[start];
                    start++;
                }
                
                if(prod<k)
                {
                    count+=end-start+1;
                    
                }
                
            }
            
            
            cout<<count<<endl;
            
        }

	return 0;
}
