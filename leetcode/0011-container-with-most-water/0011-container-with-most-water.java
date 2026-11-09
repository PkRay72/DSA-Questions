class Solution {
    public int maxArea(int[] height) {
        // int ans=0;
        // int n=height.length;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<n;j++){
        //         int h=Math.min(height[i],height[j]);
        //         int w=j-i;
        //         int area=h*w;
        //         ans=Math.max(ans,area);
        //     }
        // }

        int ans=0;
        int n=height.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int w=right-left;
            int water=h*w;
            ans=Math.max(ans,water);
            if(height[left]<height[right]){
              left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}