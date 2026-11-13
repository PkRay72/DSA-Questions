class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target<=arr[mid]){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
