class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-2;i++){
        int left=i+1;
        int right=n-1;
        
        while(left<right){
            int sum=arr[i]+arr[left]+arr[right];
            if(sum==target){
                return true;
            }
            if(sum<target){
                left++;
                sum++;
            }
            if(sum>target){
                right--;
                sum--;
            }
        }
       
            
        }
         return false;
    }
}
