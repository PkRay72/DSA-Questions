class Solution {
    public int[] sortArray(int[] nums) {
    int min=50005,max=-50005;

    for(int num:nums){
        if(num<min) min=num;
        if(num>max) max=num;
    }

    int[] count=new int[max-min+1];
    for(int num:nums){
        count[num-min]++;
    }
    int index=0;
    for(int i=0;i<count.length;i++){
        while(count[i]>0){
            nums[index++]=i+min;
            count[i]--;
        }
    }
    return nums;
    }
}