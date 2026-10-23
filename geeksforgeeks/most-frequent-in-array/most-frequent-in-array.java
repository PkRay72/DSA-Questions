class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        Arrays.sort(arr);
        int len=1;
        int MaxCount=1;
        int el=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                len++;
            }else{
                len=1;
            }
            if(len>=MaxCount){
                MaxCount=len;
                el=arr[i];
            }
        }
        return el;
    }
}