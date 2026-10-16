class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans=new ArrayList<>();

         for(int row=1;row<=numRows;row++){
            List<Integer> arr=new ArrayList<>();
            arr.add(1);
            int prev=1;
            for(int col=1;col<row;col++){
                int new_el=prev*(row-col);
                new_el/=col;
                arr.add(new_el);
                prev=new_el;
            }
            ans.add(arr);
         }
         return ans;
    }
}