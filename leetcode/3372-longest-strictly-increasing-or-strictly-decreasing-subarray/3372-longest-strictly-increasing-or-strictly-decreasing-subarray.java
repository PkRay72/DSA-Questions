class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int j=0;
        int ans=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                ans=Math.max(ans,i-j+1);
            }else{
                j=i;
            }
        }
         j=0;
       for(int i=1;i<nums.length;i++){
             if(nums[i]<nums[i-1]){
                ans=Math.max(ans,i-j+1);
            }else{
                j=i;
            }
       }
        
        return ans;
    }
}