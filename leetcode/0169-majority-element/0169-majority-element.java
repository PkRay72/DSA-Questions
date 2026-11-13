class Solution {
    public int majorityElement(int[] nums) {
      /*int count=0;
        int ele=0;
        for(int arr:nums){
        if(count==0){
            ele=arr;
        } 
        if(arr==ele){
            count++;
        }else{
            count--;
        }
        }
        return ele;*/




        // int n=nums.length;
        // Arrays.sort(nums);
        // return nums[n/2];

        int count=0;
        int ele=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ele=nums[i];
                count=1;
            }else if(nums[i]==ele){
                count++;
            }else{
                count--;
            }

        }
        return ele;
    }
}