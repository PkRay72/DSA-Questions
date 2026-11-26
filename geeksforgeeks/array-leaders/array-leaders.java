class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        
        ArrayList<Integer> leaders=new ArrayList<>();
        int n=arr.length;
        int maxRight=arr[n-1];
        leaders.add(maxRight);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxRight){
                maxRight=arr[i];
                leaders.add(arr[i]);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
