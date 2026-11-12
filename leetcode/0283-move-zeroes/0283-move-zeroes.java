class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int pos=0;
        int zero=0;
        while(pos<nums.length){
            if(nums[pos]!=0){
                int temp=nums[pos];
                nums[pos]=nums[zero];
                nums[zero]=temp;
                zero++;
            }
             pos++;
        }
        
    }
}