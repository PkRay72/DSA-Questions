class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j< b.length){
            if(a[i]==b[j]){
                int val=a[i];
                ans.add(val);
                
                while(i<a.length && a[i] == val){
                    i++;
                }
                while(j<b.length && b[j]==val){
                    j++;
                }
            }else if(a[i]<b[j]){
                i++;
            }else{
                j++;
            }
        }
        return ans;
        
    }
}