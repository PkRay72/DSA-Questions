class Solution {
    public void reverseArray(int arr[]) {
        // code here
        helper(arr,0,arr.length-1);
        
    }
    private void helper(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        helper(arr,left+1,right-1);
    }
        
        
        
    
}