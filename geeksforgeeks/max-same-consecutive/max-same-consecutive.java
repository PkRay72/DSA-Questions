class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int count=1;
        int ans=1;
        for(int i=1;i<arr.length;i++){
            int ele=arr[i];
            int prev=arr[i-1];
            if(ele==prev){
                count++;
            }
            else{
                count=1;
            }
            if(count>ans){
                ans=count;
            }
        }
        return ans;
    }
}
