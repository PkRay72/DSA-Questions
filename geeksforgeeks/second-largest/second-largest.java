class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int max = -1;
        int smax=-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            if(arr[i]<max&&smax<arr[i]){
                smax=arr[i];
            }
        }
        return smax;
    }
}