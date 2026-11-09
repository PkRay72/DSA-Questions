class Solution {
    public int minSubarraySum(int[] nums) {
        // code here
        int ans=nums[0];
                int sum=0;
                for(int i=0;i<nums.length;i++){
                    sum+=nums[i];
                    if(nums[i]<sum){
                        sum=nums[i];
                    }
                    if(sum<ans){
                        ans=sum;
                    }
                }
                return ans;
    }
}