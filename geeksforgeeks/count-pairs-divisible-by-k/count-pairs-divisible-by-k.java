class Solution {
    public long countKdivPairs(int[] arr, int k) {
        long ans = 0;
        long[] freq = new long[k];
        
        for (int x : arr) {
            int rem = x % k;
            int req = (k - rem) % k;
            ans += freq[req];
            freq[rem]++;
        }
        
        return ans;
    }
}