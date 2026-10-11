class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        
        // 1. Fixed loop condition (< instead of <=)
        for (int i = 0; i < nums.length; i++) {
            // 2. Used Math.min and Math.max to safely find values
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        
        // 3. Called the helper method
        return gcd(min, max);
    }

    // Helper method to compute GCD using the Euclidean Algorithm
     private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
