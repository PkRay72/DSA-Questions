
//import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       // Arrays.sort(nums);
     /*   int i = 0 ;
        for( i = 0 ;i < nums.length;i++){
            for(int j = i + 1; j < nums.length;j++){
            if(nums[i] + nums[j] == target){
                return new int[] {i ,j};
            }
            } 
        }
        return new int[] {};  */
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int el=nums[i];
            int req=target-el;
            if(mpp.containsKey(req)==true){
                int index1=mpp.get(req);
                int index2=i;
                return new int[]{index1,index2};
            }
            mpp.put(el,i);
        } 
        return new int[]{};
    }
    
}

        

