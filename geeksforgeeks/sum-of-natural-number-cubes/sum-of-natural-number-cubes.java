class Solution {
    int sumOfSeries(int n) {
    //   int sum=0;
    //   int d=1;
              
    //         for(int i=1;i<=n;i++){
    //               sum+=d*d*d;
    //               d++;
    //      }
    //     return sum;
        
        
       int sum=(n*(n+1))/2;
        return sum*sum;
    }
}