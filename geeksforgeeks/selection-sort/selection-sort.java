class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndx]){
                    minIndx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndx];
            arr[minIndx]=temp;
        }
        
        
        
        // class Solution {
        //     void selectionSort(int[] arr) {
        //         // code here
        //         int n = arr.length;
        //         for(int i = 0;i < n- 1;i++){
        //             int min = Integer.MAX_VALUE,mindx = -1;
        //             for(int j = i; j< n; j++){
        //                 if(arr[j] < min){
        //                     min = arr[j];
        //                     mindx = j;
        //                 }
        //             }
        //             int temp = arr[i];
        //             arr[i] = arr[mindx];
        //             arr[mindx] = temp;
        //         }
        //     }
        // }
    }
}