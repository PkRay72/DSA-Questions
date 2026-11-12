class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[0];
        int profit=0;
        for(int sell=0;sell<n;sell++){
            profit=Math.max(profit,prices[sell]-buy);
            if(buy>prices[sell]){
                buy=prices[sell];
            }
        }
        return profit;
    }
}