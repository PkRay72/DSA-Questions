class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            int ele=arr[i];
            int prev=arr[i-1];
            if(ele==1){
                count++;
            }
            else{
                count=0;
            }
            if(count>ans){
                ans=count;
            }
        }
        return ans;
    }
}