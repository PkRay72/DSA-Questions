class Solution {
    int majorityElement(int arr[]) {
        // code here
       int n=arr.length;
       int candidate=0;
       int count=0;
       
       for(int i=0;i<n;i++){
           if(count==0){
               candidate=arr[i];
               count=1;
           }else if(arr[i]==candidate){
               count++;
           }else{
               count--;
           }          
       }
       int freq=0;
       for(int i=0;i<n;i++){
           if(arr[i]==candidate){
               freq++;
           }
       }
       return (freq>n/2)?candidate:-1;
    }
}