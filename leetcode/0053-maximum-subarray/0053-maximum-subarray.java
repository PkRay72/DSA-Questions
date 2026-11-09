class Solution {
    public int maxSubArray(int[] nums) {
      /*  int maxSoFar=arr[0];
        int currentSum=arr[0];
        
        for(int i=1;i<arr.length;i++){
            currentSum=Math.max(arr[i],currentSum+arr[i]);
            maxSoFar=Math.max(maxSoFar,currentSum);
        }
        return maxSoFar;*/
     /*   int ans=Integer.MIN_VALUE;
        int current_sum=0;
        for(int i=0;i<nums.length;i++){
            current_sum+=nums[i];
            if(nums[i]>current_sum){
                current_sum=nums[i];
            }
            if(current_sum>ans){
                ans=current_sum;
            }

        }
        return ans;*/
        // int ans=Integer.MIN_VALUE;
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        //     if(nums[i]>sum){
        //         sum=nums[i];
        //     }
        //     if(sum>ans){
        //         ans=sum;
        //     }
        // }
        // return ans;


        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]>sum){
                sum=nums[i];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;

        
    }
}