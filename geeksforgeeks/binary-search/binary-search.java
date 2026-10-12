class Solution {
    public boolean binarySearch(int[] arr, int tar) {
        // code here
        int low = 0;
        int  high = arr.length - 1;
        int idx = -1;
        while(low <= high){
            int mid = (low+high)/2;
           if(arr[mid]==tar) return true;
           else if(arr[mid] > tar) high = mid -1;
            else {
               low = mid+1;
            }
            
        }
        return false;
    }
}