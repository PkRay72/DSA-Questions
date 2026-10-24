class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       ArrayList<Integer> s1=new ArrayList<>();
       int i=0,j=0;
       while(i<nums1.length && j<nums2.length){
        if(nums1[i]==nums2[j]){
            s1.add(nums1[i]);
            i++;
            j++;
        }
        else{
            if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }

       }
       int[] ans=new int[s1.size()];
       int index=0;
       for(int el:s1){
        ans[index]=el;
        index++;
       }
       return ans;
      
    }
}