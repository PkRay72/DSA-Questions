class Solution {
    void pushZerosToEnd(int[] nums) {
        // code here
          int low = 0;
       // int mid = 0;
      

        for(int i=0;i<nums.length;i++) {
            if (nums[i] != 0) {
                // Swap nums[low] and nums[mid]
                int temp = nums[i];
                nums[i] = nums[low];
                nums[low] = temp;
                low++;
                
            }
        }
        
    }
}