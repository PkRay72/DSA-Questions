class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
       ArrayList<Integer> ans=new ArrayList<>();

            long val=1;
            ans.add(1);
           
            for(int i=1;i<n;i++){
               val=val*(n-i)/i;
               ans.add((int) val);
            }
         return ans;
    }
}