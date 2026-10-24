class Solution {
    void segregate0and1(int[] arr) {
        // code here
        // int noOfzeros = 0;
        // int noOfones = 0;
        // for(int ele : arr){
        //     if(ele == 0)
        //     noOfzeros++;
        //     else
        //     noOfones++;
        // }
        // for(int i = 0; i < noOfzeros ; i++){
        //     arr[i] = 0;
        // }
        // for(int i = noOfzeros; i < arr.length; i++){
        //     arr[i] = 1;
        // }
        int n1=0;
        int n0=0;
        for(int el:arr){
            if(el==0){
                n0++;
            }else{
                n1++;
            }
        }
        for(int i=0;i<n0;i++){
            arr[i]=0;
        }
        for(int i=n0;i<arr.length;i++){
            arr[i]=1;
        }
        
    }
}

